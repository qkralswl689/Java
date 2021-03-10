package com.javateam.jse;

import java.awt.*; // JAVA �⺻ GUI Component/Container ToolKit 
//ex) Button, Frame, Panel ���
import java.awt.event.*; // event = I/O device ����  
//ex) ��ư(��ġ: device)�� ������, ���콺(��ġ : device)�� Ŭ���Ѵ�.
//GUI Component(��ư, �޴� ���)�� ó���ϴ� ���
//1. ��ġ(device -> Component) �̺�Ʈ(Event) �߻�
//2. ������(Listener) �� ��� �ϰ� �ִٰ� �̺�Ʈ ����.
//3. �ڵ鷯(Event handler)�� �� �̺�Ʈ�� ó���Ѵ�.
class InnerEX {
public static void main(String[] args) {
		
		Frame f = new Frame(); // Component(������Ʈ)�� ���Խ�ų Container(�����̳�)�� �߰��Ѵ�.
		f.setSize(300, 200); // �����̳��� ũ�⸦ �����Ѵ�.
		f.setLayout(new GridLayout(1, 1)); // ���̾ƿ� �Ŵ����� ������ �����Ѵ�.

		Button b = new Button("Start");
		b.setSize(200, 100); // Button�� ũ�⸦ �����Ѵ�.
		f.add(b); // ������ Button�� Frame�� ���Խ�Ų��.
		f.setVisible(true); // ȭ�鿡 ���������� �����Ѵ�.

		// ���� ������ �ݱ� ��ư "X"�� Ȱ��ȭ(�۵�)�Ƿ���
		// �Ʒ��� �̺�Ʈ �����ʿ� �ڵ鷯�� �߰��ϸ� �ȴ�.
		// �߰����� ���� ���� Ctrl + Alt+ Del �� ������ ���μ��� �гο���
		// javaw.exe�� ���μ��� ���Ḧ �ؾ� â�� ������ �ȴ�.

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
//				System.out.println("������ȭ�� �Ǿ���");
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
				System.out.println("������ȭ�� �Ǿ���");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
			
		});


		// Event Listener(�̺�Ʈ ������) , �����ϰ� "������"��� ���� �θ���.
		// : ��ġ(device)���� �߻��ϴ� I/O(�Է�/���) ��ȣ�� �����ϴ� "������"
		// �޼ҵ��� �Ű������� �� �ڸ��� Ŭ������ ��(���� Ŭ����)
		// -> �ڵ尡 �������� -> ���� ���!
		// �̷��� ������ ������ ����� ����(Adapter pattern)�̶�� �Ѵ�.
		// ���� ���ؼ� � ���α׷��� �ٸ� ���α׷� �ڵ带 �Ϻκ� ó�� (�Ű�������) �����Ἥ
		// �ڵ带 �����ϰ� ���̴� ���.
		Demo demo = new Demo();
		// b.addActionListener(demo); // �������� ��
		// b.addActionListener(new Demo()); // �������� ��
		b.addActionListener(new ActionListener() {

			// �̺�Ʈ �ڵ鷯(Event Handler) : �̺�Ʈ ó����
			// ������ ���α׷��Ӵ� �� �̺�Ʈ ó����(�ڵ鷯) �ȿ���
			// �������̵�(override: ���α׷���!) �Ͽ� ���α׷��� �ۼ�.
			@Override
			public void actionPerformed(ActionEvent e) {

				// �� �κ��� ���α׷��Ӱ� �ۼ���(������:override) �κ�
				System.out.println("ActionEvent occurred!!!");
			}
		}); // �͸� Ŭ������ ��); // �������� ��

	} // main�޼����� ��
} // InnerEx8Ŭ������ ��

class Demo implements ActionListener {

	// �̺�Ʈ �ڵ鷯(Event Handler) : �̺�Ʈ ó����
	// ������ ���α׷��Ӵ� �� �̺�Ʈ ó����(�ڵ鷯) �ȿ���
	// �������̵�(override: ���α׷���!) �Ͽ� ���α׷��� �ۼ�.
	@Override
	public void actionPerformed(ActionEvent e) {

		// �� �κ��� ���α׷��Ӱ� �ۼ���(������:override) �κ�
		System.out.println("ActionEvent occurred!!!");
	}
} // �͸� Ŭ������ ��

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


