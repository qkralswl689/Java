package jse_20210308_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {
	
	public static void main(String[] args) {
		
				
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("c:/Temp/Test1.db");
			
			byte[] array = {10,20,30};
			
					
			os.write(array);
			
			
			os.flush();
			// os.close();
		
		// } catch(Exception e) {
			
		// } catch (FileNotfoundException | IOException e) { (X)
		// ���� ����(���,����)�� ����ó�� Ŭ���� ���� X
			
			
		}catch(FileNotFoundException e) {
			
			System.err.println("WriteEx FNFE : " + e.getMessage());
			
			e.printStackTrace(); // ���� ������ �ϴ�
			
		}catch(IOException e) { // �������� ����ó���� ���߿� ���;� �Ѵ�
			
		}finally { // �ڿ��ݳ�
			try {
				if (os != null) os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//  ��ü try ��
	} // main ��

} // class ��