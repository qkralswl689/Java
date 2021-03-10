package Test;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import java.lang.reflect.Method;

public class SocketServer {
	
	public static void main(String args[]) throws IOException {
	
	 
	
	    // ����-1) TCP ���� ���� ��ü(�ν��Ͻ�) serverSocket �� �ʱ�ȭ �մϴ�.
		
		ServerSocket serverSocket = null ;
	 
	
	// ����-2) try ~ catch ���·� IOException ����ó�� Ŭ������ ����ó���� �ϰ� 
	// ���� �α� �޽����� getMessage�޼��带 Ȱ���Ͽ� ������ ��µ� �� �ֵ��� ��ġ�մϴ�.
	// ���� ������ 8888�� ��Ʈ�� ����(bind)�Ͽ� ������ŵ�ϴ�.
	
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",8888));
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	 
	
	// ����-3) ���⼭ �� �� ������ ���÷���(reflection)�� Ȱ���Ͽ� ����ó�� �޽�¡�� �� �� 
	// ����ó���� �߻��� �޼��带 Ȯ���� �� �ֵ��� �޽����� �� ����ϴ� ���·� ��ġ�� �� �ֽ��ϴ�.
	
		  try {
	            Class<?> clazz = Class.forName("java.util.Vector");

	            Method[] methods = clazz.getMethods();

	            for (Method method : methods) {
	                System.out.println(method.toString());
	            }
		} catch (ClassNotFoundException e){
			 e.printStackTrace();
		}	 
		
	
	// ����-4) ���� �ݺ����� Ȱ���Ͽ� ���������� Ŭ���̾�Ʈ�� ��û�� ����ϴ� 	
	// ���� ���α׷��� ������ �� �� �ֵ��� ��ġ�մϴ�.
	 	
	
	try {
		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println("������ ���� ��û ���");
		}
	}catch (Exception e) {
		
	}
	
	
	// ����-5) ���� ������ Ŭ���̾�Ʈ�� ���� ��û�� ���� ������ ��� ��ٸ� �� �ֵ��� ��ġ�մϴ�.	
	// ���� ��û�� ������ Ŭ���̾�Ʈ ���ϰ� ����� ���ο� ������ �����մϴ�.
	try {
		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println(socket.getInetAddress() + " IP�κ��� �����û�� ���Խ��ϴ�.");
			InetSocketAddress isa=(InetSocketAddress)socket.getRemoteSocketAddress();
		}
	}catch (Exception e) {
		
	}
	  
	
	// ����-6) ������ ��½�Ʈ���� OutputStream Ŭ������ Ȱ���Ͽ� out ��ü�� �����մϴ�.
	 
	Socket socket = null;
	
	OutputStream out = socket.getOutputStream();
	
	// ����-7) ������ ������ out ��ü�� Ȱ���Ͽ� DataOutputStream Ŭ������ dos �ν��Ͻ��� �����մϴ�.
	
	DataOutputStream dos = new DataOutputStream(out);


	
	// ����-8) ���� ����(remote socket)�� �����͸� UTF-8 �������� �����ϴ�.	
	// �޽��� : "�������� ������ �޽����Դϴ�."
	
	String msg = "�������� ������ �޽����Դϴ�.";
	
	try {
		byte[] str = msg.getBytes("UTF-8");
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}

	// ����-9) ������ ������ ��Ʈ��(dos)�� ����(socket) �ڿ��� �ݳ������� finally 
	// ������ �߰��Ͽ� finally ������ �ű⵵��(�̰�) ��ġ�մϴ�.
	
	finally {
		try {
			dos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	} // main
	
}
	
