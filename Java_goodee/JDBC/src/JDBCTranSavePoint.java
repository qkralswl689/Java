import java.sql.*;

public class JDBCTranSavePoint 
{
    
    private static JDBCTranSavePoint instance = null;
    // private JDBCTranSavePoint() { }
    public static final JDBCTranSavePoint getInstance() {
        if (instance == null)
            instance = new JDBCTranSavePoint();
        return instance;
    }
    
    Connection con;
    Statement stmt;
    String sql1, sql2, sql3, sql4;
    Savepoint sp1, sp2, sp3, sp4; // savepoint
    
    // DB ����(connection)
    public Connection getConnection() {
            // throws ClassNotFoundException, Exception {
 
        StackTraceElement ste 
            = new Exception().getStackTrace()[0];
        String className = ste.getClassName();
        String methodName = ste.getMethodName();
        Connection con = null;
        
        // JDBC connection specs
        final String url = "jdbc:oracle:thin:@localhost:1521:xe";
        final String user = "java";
        final String password = "java";
        
        try {
                Class.forName("oracle.jdbc.OracleDriver");
                con = DriverManager.getConnection(url, user, password);
                
        } catch (ClassNotFoundException e) {
            System.out.println(className+"."+methodName
                                +" SQLE :");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(className+"."+methodName
                              +" E :");
            e.printStackTrace();
        } 
        
        return con;
    }
 
    public JDBCTranSavePoint()
    {
        sql1 = "INSERT INTO sample "
        	 + "VALUES ('java','mouse')";
        
        // ��Ȳ) SQL������ ������ ���Ƿ� ������ ��Ȳ ����.
        sql2 = "UPDATE sample SET "
        	 + "name='keyboard' "
        	 + "WHERE id='java'";
 
        sql3 = "INSERT INTO sample "
        	 + "VALUES ('java','mouse')";
        
        // ��Ȳ) SQL������ ������ ���Ƿ� ������ ��Ȳ ����.
        sql4 = "UPDATE sample SET "
           	 + "name='notebook' "
           	 + "WHERE id='java'";
 
        runSQL();
    }
    
    public void runSQL()
    {
        con = getConnection();
        
        try {
                con.setAutoCommit(false); // ���� commit ���
                stmt = con.createStatement();
     
                stmt.executeUpdate(sql1);
                sp1 = con.setSavepoint("Insert1"); // savepoint(�̵� ����) ���� ���� !
                System.out.println("savepoint 1 �Ϸ�");
                
                stmt.executeUpdate(sql2);
                sp2 = con.setSavepoint("Update1"); // savepoint(�̵� ����)
                System.out.println("savepoint 2 �Ϸ�");
     
                stmt.executeUpdate(sql3);
                sp3 = con.setSavepoint("Insert2"); // savepoint(�̵� ����)
                System.out.println("savepoint 3 �Ϸ�");
 
                stmt.executeUpdate(sql4);
                sp4 = con.setSavepoint("Update2"); // savepoint(�̵� ����)
                System.out.println("savepoint 4 �Ϸ�");
                
                con.commit(); // Ʈ����� ����(commit)
                printMsg("Transaction commit �Ϸ�"); // �޽�¡
               
        } catch (SQLException se) {
            
            System.out.println("SQLException ���� ��Ȳ �߻� !");
            
            try {
                   printMsg("Transaction rollback (sp) ȸ�� ó��");
                  con.rollback();
                  //con.rollback(sp1); // savepoint�� ȸ��(���)
                 
            } catch (SQLException e){
                e.printStackTrace();
            }
        } finally {
            
            try    {
                     if (stmt != null) stmt.close();
                     if (con !=null) con.close();
            } catch (Exception se){
                se.printStackTrace();
            }
        } // try
    }
    
    public static void main(String[] args) 
    {
        new JDBCTranSavePoint();
    }
    
    public void printMsg(String str)
    {
        System.out.println(str);
    }
}