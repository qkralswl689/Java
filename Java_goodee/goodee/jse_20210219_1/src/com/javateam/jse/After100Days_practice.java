package com.javateam.jse;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class After100Days_practice {
	public static void main(String[] args) {
		
		// ���� ��¥ Ŭ������ Ȱ���ϴ¹�
		Calendar cal = Calendar.getInstance(); // Calendar �ν��Ͻ� ��ü ����
		
		// 1) Cal�� �ν��Ͻ��� Ȱ���Ͽ� �� ���� ���� �� ������ ���� ����
		
		// int year,month,date ���� ���� �� cal �ν��Ͻ� �̿��Ͽ� ��,��,�� ���� �� ������ ���� 
		int year = cal.get(cal.YEAR);
		int  month = cal.get(cal.MONTH) + 1;
		int date = cal.get(cal.DATE);
		
		
		//  printf �޼��� ����Ͽ� 2021�� 2�� 18�� �������� ���
		System.out.printf("1�� �� : %d�� %d�� %d��",year,month,date);
		System.out.println();
		// 2) ���Ϻ��� 100�� �Ŀ� �ش�Ǵ� ���� ����
		
		// ** �������� set
		cal.set(year, month-1, date); // �� �Է½� -1�� ���� �Է���
		cal.add(Calendar.DATE,100 );
		
		// 3) Date Formatter Ŭ���� ����Ͽ� ��¥ ���
		SimpleDateFormat dt = new SimpleDateFormat("yyyy�� M�� d��");
		String str = dt.format(cal.getTime());
		System.out.println("2�� �� : " + str);
		
		// 4) DateTimeFormatter Ŭ���� ����Ͽ� ��¥ 2021�� O�� OO�� �������� ���
		// LocalDateTime dt2 = LocalDateTime.now(); // 5���� 
		DateTimeFormatter today = DateTimeFormatter.ofPattern("yyyy�� M�� d��");
		// System.out.println(dt2.format(today)); // 5�� ��

		// 5) LocalDateTime�� ��� �޼���(now)�� Ȱ���Ͽ� ���� ��¥�� ���Ͽ� 
		//    format ��� �޼���� ������ �ۼ��� ��¥ ���� ��ü�� �޼��� ���ڷ� Ȱ���Ͽ� ���� ��¥�� �μ��մϴ�.
		LocalDateTime dt3 = LocalDateTime.now();
		// DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy�� M�� d��"); // ������ ����߱⶧���� ���� ���ص� ��
		System.out.println("3�� �� :" + dt3.format(today));
		
		// 6) ���Ϸκ��� 100�������� ��¥�� LocalDateTime ��� �޼���(plusDays)�� Ȱ���Ͽ�
		//	������ ���� �����ϰ� �������� �޼���(format)�� Ȱ���Ͽ� ���� ��ü�� ���ڷ� �Է��Ͽ� ���� ��¥�� �μ��մϴ�.
		 LocalDateTime dt4 = LocalDateTime.now(); // ������ �����߱� ������ ���� ���ϰ� ������ ����ص� �ȴ�
		
		//System.out.println("4�� �� : " + dt4.plusDays(100)); // ��,��, �� ���� ���
		 System.out.println("4�� �� : " +dt4.plusDays(100).format(today));  // ��,��, �� �����ϰ� ���


	}
	

}
