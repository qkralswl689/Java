package com.javateam.jse;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class After100Days_practice2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		// 1) ���� cal �ν��Ͻ��� Ȱ���Ͽ� ����� ������ ���ϰ� ���� year, month, date ��� ������ ������ �����մϴ�.
		
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH) + 1; // 0���� �����ϱ� ������ +1 ���ش�
		int date = cal.get(cal.DATE);
		
		// printf �޼��带 Ȱ���Ͽ� " 2021�� 2�� 18�� " �� ���� �������� ȭ�鿡 ����մϴ�.
		
		System.out.printf("1�� �� : %d�� %d�� %d��",year,month,date);
		System.out.println();
		
		// 2) ���� ��¥�κ��� 100���Ŀ� �ش�Ǵ� ������ �����մϴ� Calendar Ŭ������ set, add ��� �޼��带 Ȱ��
		cal.set(year, month-1, date);
		cal.add(Calendar.DATE,100);
		
		// 3) ������ ���� ��¥�� Date Formatter Ŭ������ Ȱ���Ͽ� 2021�� O�� O�� ���� �������� ȭ�鿡 ��� => SimpleDateFormat Ŭ������ Ȱ��
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy�� M�� d��");
		
		String result = df.format(cal.getTime());
		
		System.out.println("2�� �� : " + result);
		
		// 4) DateTimeFormatter�� Ȱ���Ͽ� 2021�� O�� OO�� ���� ��µ� �� �ֵ��� ��¥ ������ �����մϴ�.
		
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy�� M�� d��");
		
		// 5) LocalDateTime�� ��� �޼���(now)�� Ȱ���Ͽ� ���� ��¥�� ���Ͽ�
		// format ��� �޼���� ������ �ۼ��� ��¥ ���� ��ü�� �޼��� ���ڷ� Ȱ���Ͽ� ���� ��¥�� �μ��մϴ�.
		
		LocalDateTime dt2 = LocalDateTime.now();
		
		System.out.println("3�� �� : " + dt.format(dt2));
		
		// 6) ���Ϸκ��� 100�������� ��¥�� LocalDateTime ��� �޼���(plusDays)�� Ȱ���Ͽ�
		// ������ ���� �����ϰ� �������� �޼���(format)�� Ȱ���Ͽ� ���� ��ü�� ���ڷ� �Է��Ͽ� ���� ��¥�� �μ��մϴ�.
		
		System.out.println("4�� �� : " + dt2.plusDays(100).format(dt));
            

		
	}
}
