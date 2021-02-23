package Java_Nam;
	class Tv{
		// 부모 멤버 5개
		boolean power; // 전원상태  (on/off)
		int channel;  // 채널
		
		void power() {
			power =! power;
		}
		void channelUp() {
			++channel;
		}
		void chnnelDown() {
			--channel;
		}			
	}	
	
	// 자식 멤버 2개 + 부모멤버 5개  = 총 7개
	class SmartTv extends Tv{ // SmartTv는 Ch7_1Ex 캡션(자막)을 보여주는 기능
		boolean caption; // 캡션상태 (on/off)
		void displayCaption(String text) { 
			if(caption) { // 캡션 상태가 on(true)일 때만 text를 보여준다
				System.out.println(text);
			}
		}
	}


public class Ch7_1Ex {	
		
		public static void main(String[] args) {
			SmartTv stv = new SmartTv();// 객체 생성
			
			stv.channel = 10; // 조상 클래스로부터 상속받은 멤버
			stv.channelUp(); // 조상 클래스로부터 상속받은 멤버
			System.out.println(stv.channel);
			stv.displayCaption("Hello");
			stv.caption = true; // 캡션(자막) 기능을 켠다
			stv.displayCaption("Hello");
			
	}
		
}


