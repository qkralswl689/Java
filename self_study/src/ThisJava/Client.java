package ThisJava;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		
		// 1) 소켓 변수 선언
		Socket socket = null;
		
		// 2) 소켓 객체 생성 => 서버에 연결요청하기 위해		
		socket = new Socket();
		
		// 3) 연결하기 , 예외처리 필요
		System.out.println("[연결 요청]");
		try {
			// ("localhost",5001) : 서버의 ip, 포트번호
			socket.connect(new InetSocketAddress("localhost",5001));
			System.out.println("[연결 성공]");
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
