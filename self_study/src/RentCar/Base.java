package RentCar;

import java.util.Calendar;

public class Base {
	
	// ���� Ŭ������ ������� ����ϴ� �޼ҵ�
	public void displayData(String data) {
		System.out.println("��ȸ�� �����ʹ�" + data + "�Դϴ�/");
		
	}
	
	// ��ȸ�� �������� �ð� ������ �����ϴ� �޼ҵ�
	public String showTime() {
		
		String date = null;
		String time = null;
		
		Calendar cal = Calendar.getInstance(); // Calendar.getInstance() => Calendar Ŭ������ �ν��Ͻ��� �����´�
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		
		date = year + "-" + month + "-" + day; // �� �� �� ����
		time = hour + ":" + min + ":" + min; // �� �� �� ����
		return date + " " + time; // �޼ҵ� ȣ���� ������ �����,�ú��� �� ���ϵȴ�

	}

}
