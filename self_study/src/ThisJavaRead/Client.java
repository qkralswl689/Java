package ThisJavaRead;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
			
			// 4) ������ ������ ���� �ڵ� �ۼ�
			byte[] bytes = null; // ����Ʈ �迭����
			String message = null; // ���ڿ��� ��ȯ�� ������ ���� ����
			
			// �������κ��� �ƿ�ǲ ��Ʈ���� ����
			OutputStream os = socket.getOutputStream();
			
			// ��Ʈ�� ���� message�� ���ڿ� �Ҵ�
			message = "Hello Server";
			
			// message�� ���� ����Ʈ �迭 ���
			bytes = message.getBytes("UTF-8");
			
			// 5) output Stream ���� ������ ����(to����)
			os.write(bytes);
			os.flush();
			System.out.println("[������ ������ ����]");
			
			// 6) ������ ���� ������ �ޱ�
			InputStream is = socket.getInputStream();
			
			// ���� 100¥�� ����Ʈ �迭 ����
			bytes = new byte[100];
			
			// input Stream ���κ��� read�޼ҵ� ȣ���� ����Ʈ�迭 �б�
			int readByteCount = is.read(bytes);
			
			// ���� ����Ʈ �迭 ���ڿ��� ��ȯ
			// bytes �迭 �� 0�� �ε������� ���� ����Ʈ ����ŭ ���ڿ��� ��ȯ
			message = new String(bytes,0,readByteCount,"UTF-8");
			System.out.println("[������ �ޱ� ����] : " + message);
			
			os.close();
			is.close();
			// socket�� �Ʒ� ����ó������ �ݾ��ֱ⶧���� ���� �ݴ� ���ɾ� �ۼ� X
			
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