import java.net.*;
import java.io.*;

public class NetworkEx5 {
	public static void  main(String args[]) {
		
		// zip파일 다운로드 
		
		URL url = null;
		InputStream in = null;
		FileOutputStream out = null;
	    String address = "https://github.com/castello/javajungsuk3/blob/master/java_jungsuk3e_src_20170601.zip";

		int ch = 0;

		try {
			url = new URL(address);
			in = url.openStream();
			out = new FileOutputStream("java_jungsuk3e_src_20170601.zip");

			while((ch=in.read()) !=-1) {
				out.write(ch);
				
			}
			in.close();
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // main
}
