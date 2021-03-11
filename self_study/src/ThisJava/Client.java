package ThisJava;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		
		// 1) ���� ���� ����
		Socket socket = null;
		
		// 2) ���� ��ü ���� => ������ �����û�ϱ� ����		
		socket = new Socket();
		
		// 3) �����ϱ� , ����ó�� �ʿ�
		System.out.println("[���� ��û]");
		try {
			// ("localhost",5001) : ������ ip, ��Ʈ��ȣ
			socket.connect(new InetSocketAddress("localhost",5001));
			System.out.println("[���� ����]");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}