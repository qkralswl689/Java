package ThisJava;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class getIp {
	public static void main(String[] args) {
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("�� ��ǻ�� IP �ּ� : " + local.getHostAddress());
			System.out.println("�� ��ǻ�� �̸� : " + local.getHostName());
			
			// ���������� ip�ּ� ���
			InetAddress[] isArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : isArr) {
				System.out.println("www.naver.com IP�ּ� : " + remote.getHostAddress() );
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
