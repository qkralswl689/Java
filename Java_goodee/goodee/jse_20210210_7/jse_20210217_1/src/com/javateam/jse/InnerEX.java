package com.javateam.jse;

import java.awt.*; // JAVA 기본 GUI Component/Container ToolKit 
//ex) Button, Frame, Panel 등등
import java.awt.event.*; // event = I/O device 현상  
//ex) 버튼(장치: device)을 누른다, 마우스(장치 : device)를 클릭한다.
//GUI Component(버튼, 메뉴 등등)를 처리하는 방식
//1. 장치(device -> Component) 이벤트(Event) 발생
//2. 감지자(Listener) 가 대기 하고 있다가 이벤트 감지.
//3. 핸들러(Event handler)가 이 이벤트를 처리한다.
class InnerEX {
public static void main(String[] args) {
		
		Frame f = new Frame(); // Component(컴포넌트)를 포함시킬 Container(컨테이너)를 추가한다.
		f.setSize(300, 200); // 컨테이너의 크기를 설정한다.
		f.setLayout(new GridLayout(1, 1)); // 레이아웃 매니저의 설정을 해제한다.

		Button b = new Button("Start");
		b.setSize(200, 100); // Button의 크기를 설정한다.
		f.add(b); // 생성된 Button을 Frame에 포함시킨다.
		f.setVisible(true); // 화면에 보여지도록 설정한다.

		// 만약 윈도우 닫기 버튼 "X"이 활성화(작동)되려면
		// 아래의 이벤트 리스너와 핸들러를 추가하면 된다.
		// 추가하지 않을 경우는 Ctrl + Alt+ Del 를 눌러서 프로세서 패널에서
		// javaw.exe를 프로세서 종료를 해야 창이 닫히게 된다.

//		f.addWindowListener(new WindowListener() {
//
//			public void windowClosing(WindowEvent e) {
//				e.getWindow().setVisible(false);
//				e.getWindow().dispose();
//				System.exit(0);
//			}
//
//			public void windowOpened(WindowEvent e) {
//			}
//
//			public void windowClosed(WindowEvent e) {
//			}
//
//			public void windowIconified(WindowEvent e) {
//				System.out.println("아이콘화가 되었다");
//			}
//
//			public void windowDeiconified(WindowEvent e) {
//			}
//
//			public void windowActivated(WindowEvent e) {
//			}
//
//			public void windowDeactivated(WindowEvent e) {
//			}
//
//		});
		// CloseClass closeClose = new CloseClass();
		// f.addWindowListener(closeClose);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("아이콘화가 되었다");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
			
		});


		// Event Listener(이벤트 리스너) , 간단하게 "리스너"라고 많이 부른다.
		// : 장치(device)에서 발생하는 I/O(입력/출력) 신호를 감지하는 "감지자"
		// 메소드의 매개변수가 들어갈 자리에 클래스가 들어감(내부 클래스)
		// -> 코드가 간결해짐 -> 성능 향상!
		// 이러한 디자인 패턴을 어댑터 패턴(Adapter pattern)이라고 한다.
		// 쉽게 말해서 어떤 프로그램에 다른 프로그램 코드를 일부분 처럼 (매개변수로) 끼워써서
		// 코드를 간결하게 줄이는 방식.
		Demo demo = new Demo();
		// b.addActionListener(demo); // 리스너의 끝
		// b.addActionListener(new Demo()); // 리스너의 끝
		b.addActionListener(new ActionListener() {

			// 이벤트 핸들러(Event Handler) : 이벤트 처리자
			// 실제로 프로그래머는 이 이벤트 처리자(핸들러) 안에서
			// 오버라이드(override: 프로그래밍!) 하여 프로그램을 작성.
			@Override
			public void actionPerformed(ActionEvent e) {

				// 이 부분이 프로그래머가 작성한(재정의:override) 부분
				System.out.println("ActionEvent occurred!!!");
			}
		}); // 익명 클래스의 끝); // 리스너의 끝

	} // main메서드의 끝
} // InnerEx8클래스의 끝

class Demo implements ActionListener {

	// 이벤트 핸들러(Event Handler) : 이벤트 처리자
	// 실제로 프로그래머는 이 이벤트 처리자(핸들러) 안에서
	// 오버라이드(override: 프로그래밍!) 하여 프로그램을 작성.
	@Override
	public void actionPerformed(ActionEvent e) {

		// 이 부분이 프로그래머가 작성한(재정의:override) 부분
		System.out.println("ActionEvent occurred!!!");
	}
} // 익명 클래스의 끝

class CloseClass implements WindowListener {

	@Override
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


}


