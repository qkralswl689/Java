package Java_Nam;

class Point { // Ŭ���� ����
	int x;
	int y;
	
	
	 String getLocation() {
		return "x:" + x + "y:" + y;
	}
}

class Point3D extends Point{ // �� Ŭ���� ��ӹ޴� Ŭ���� ����
	int z;

	// ������ getLocation()�� �������̵� 
	String getLocation() {
		return "x:" + x + "y:" + y+"z:" + z;
	}		
}
public class OverrideTest {
	
	public static void main(String[] args) {
		
		Point3D p = new Point3D();// ��ü ����
		
		p.x = 3;
		p.y = 5;
		p.z =7;
		System.out.println(p.getLocation());
		
	}
}
