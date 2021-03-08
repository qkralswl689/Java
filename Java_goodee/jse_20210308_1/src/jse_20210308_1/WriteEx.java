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
		// 같은 성격(상속,구현)의 예외처리 클래스 동반 X
			
			
		}catch(FileNotFoundException e) {
			
			System.err.println("WriteEx FNFE : " + e.getMessage());
			
			e.printStackTrace(); // 제일 디테일 하다
			
		}catch(IOException e) { // 포괄적인 예외처리가 나중에 나와야 한다
			
		}finally { // 자원반납
			try {
				if (os != null) os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//  전체 try 끝
	} // main 끝

} // class 끝
