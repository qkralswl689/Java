import java.net.*;
import java.io.*;

public class NetworkEx4 {
	public static void  main(String args[]) {
		// html ���
		
		URL url = null;
		BufferedReader input = null;
		String address = "https://cafe.naver.com/gdjava1";
		String line = "";

		try {
			url = new URL(address);

		    input = new BufferedReader(new InputStreamReader(url.openStream()));

			while((line=input.readLine()) !=null) {
				System.out.println(line);
			}
			input.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
