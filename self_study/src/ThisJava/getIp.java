package ThisJava;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class getIp {
	public static void main(String[] args) {
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소 : " + local.getHostAddress());
			System.out.println("내 컴퓨터 이름 : " + local.getHostName());
			
			// 도메인으로 ip주소 얻기
			InetAddress[] isArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : isArr) {
				System.out.println("www.naver.com IP주소 : " + remote.getHostAddress() );
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
