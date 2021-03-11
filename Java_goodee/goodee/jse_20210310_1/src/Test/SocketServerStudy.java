package Test;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import java.lang.reflect.Method;

public class SocketServerStudy {
	
	public static void main(String args[]) throws IOException {
	
	 
	
	    // ����-1) TCP ���� ���� ��ü(�ν��Ͻ�) serverSocket �� �ʱ�ȭ �մϴ�.
		
		// �ʵ� �ʱ�ȭ
		ServerSocket serverSocket = null;		
		DataOutputStream dos = null; 
		Socket socket = null;
	
	// ����-2) try ~ catch ���·� IOException ����ó�� Ŭ������ ����ó���� �ϰ� 
	// ���� �α� �޽����� getMessage�޼��带 Ȱ���Ͽ� ������ ��µ� �� �ֵ��� ��ġ�մϴ�.
	// ���� ������ 8888�� ��Ʈ�� ����(bind)�Ͽ� ������ŵ�ϴ�.
	
		try {
			// ���� bind
			 serverSocket = new ServerSocket(8888);
			
		} catch(IOException e) {
			
			// ����-3) ���⼭ �� �� ������ ���÷���(reflection)�� Ȱ���Ͽ� ����ó�� �޽�¡�� �� �� 
			// ����ó���� �߻��� �޼��带 Ȯ���� �� �ֵ��� �޽����� �� ����ϴ� ���·� ��ġ�� �� �ֽ��ϴ�.
			System.out.println(new Exception().getStackTrace()[0].getMethodName() 
								+ " : " + e.getMessage());
			
		}	
		
	
	// ����-4) ���� �ݺ����� Ȱ���Ͽ� ���������� Ŭ���̾�Ʈ�� ��û�� ����ϴ� 	
	// ���� ���α׷��� ������ �� �� �ֵ��� ��ġ�մϴ�.
	

		while(true) {
			try {
				System.out.println("������ ���� ��û ���");
				// ����-5) ���� ������ Ŭ���̾�Ʈ�� ���� ��û�� ���� ������ ��� ��ٸ� �� �ֵ��� ��ġ�մϴ�.	
				// ���� ��û�� ������ Ŭ���̾�Ʈ ���ϰ� ����� ���ο� ������ �����մϴ�.
				Socket socket1 = serverSocket.accept();
				System.out.println(socket1.getInetAddress() + " IP�κ��� �����û�� ���Խ��ϴ�.");
				
				// ����-6) ������ ��½�Ʈ���� OutputStream Ŭ������ Ȱ���Ͽ� out ��ü�� �����մϴ�.
				 
				OutputStream out = socket1.getOutputStream();
				
				// ����-7) ������ ������ out ��ü�� Ȱ���Ͽ� DataOutputStream Ŭ������ dos �ν��Ͻ��� �����մϴ�.
				
				DataOutputStream dos1 = new DataOutputStream(out);

				// ����-8) ���� ����(remote socket)�� �����͸� UTF-8 �������� �����ϴ�.	
				// �޽��� : "�������� ������ �޽����Դϴ�."
				
				dos1.writeUTF("�������� ������ �޼��� �Դϴ�");
				  
				// ����-9) ������ ������ ��Ʈ��(dos)�� ����(socket) �ڿ��� �ݳ������� finally 
				// ������ �߰��Ͽ� finally ������ �ű⵵��(�̰�) ��ġ�մϴ�.
				
				dos1.close();
				socket1.close();
				
			} catch (IOException e) {

				System.err.println(new Exception().getStackTrace()[0].getMethodName() + " : "

						+ e.getMessage());

				e.printStackTrace();

			} finally {
				try {
					dos.close();
					socket.close();
					serverSocket.close();

				} catch (IOException e) {

					e.printStackTrace();

				}

			}

		} // while

	} // main

}