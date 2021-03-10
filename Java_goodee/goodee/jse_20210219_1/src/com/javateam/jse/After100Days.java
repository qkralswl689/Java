package com.javateam.jse;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
public class After100Days {
 
    public static void main(String[] args) {
    	
    	// ����� ���
 
    	// ���� ��¥ Ŭ�������� Ȱ���ϴ� ��
        Calendar cal = Calendar.getInstance();
        
		// �ܰ�-1) 
		// ���� cal �ν��Ͻ��� Ȱ���Ͽ� ����� ������ ���ϰ� 
		// ���� year, month, date ��� ������ ������ �����մϴ�.
		// Hint) Calendar Ŭ������ get ��� �޼���� 
        // Calendar�� ��� �ʵ�(YEAR, MONTH, DATE) ������ Ȱ���մϴ�.
        // ����) https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html
        // ����) ��(��) ������ 0���� �����ϱ� ������ 1�� ���ؾ� �մϴ�.
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);
        
        // printf �޼��带 Ȱ���Ͽ� �Ʒ��� ���� �������� ȭ�鿡 ����մϴ�.
        // ex) 2021�� 2�� 19��
        System.out.printf("%d�� %d�� %d��\n", year, month, date);
        System.out.printf(String.format("%1$tY�� %1$tm�� %1$te��\n", cal));
        System.out.printf("%1$tY�� %1$tm�� %1$te��\n", cal);
        System.out.printf("%1$tY�� %1$tb %1$te��\n", cal);
        
        System.out.println("-----------------------------");
        
        // �ܰ�-2)
     	// ���� ��¥�κ��� 100���Ŀ� �ش�Ǵ� ������ �����մϴ�.
     	// Hint) Calendar Ŭ������ set, add ��� �޼��带 Ȱ���մϴ�.
        // ���ǻ���) ��(month) ���� �Է½� -1�� ���� �Է��մϴ�.
        // add �޼��� �̿�� ù��° ���ڷ� Calendar.DATEȤ�� Calendar.DAY_OF_MONTH �ʵ带 ����մϴ�.
        cal.set(year, month-1, date); // (1)
        cal.add(Calendar.DATE, 100); // 100�� ��
        
		// �ܰ�-3)
		// ������ ���� ��¥�� Date Formatter Ŭ������ Ȱ���Ͽ� 
		// �Ʒ��� ���� �������� ȭ�鿡 ����մϴ�.
		// ex) 2021�� O�� O��
		// Hint) SimpleDateFormat Ŭ������ Ȱ���մϴ�.
        // ����) https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat dt = new SimpleDateFormat("yyyy�� M�� d��");
        String str = dt.format(cal.getTime());
        System.out.println(str);        
        
        //////////////////////////////////////////////////////////////////
        
     	// time ��Ű���� ��¥ Ŭ�������� Ȱ���ϴ� ��
        // �ܰ�-4)
        // DateTimeFormatter�� Ȱ���Ͽ� �Ʒ��� ���� ��µ� �� �ֵ��� ��¥ ������ 
		// �����մϴ�.
		// ex) 2021�� O�� OO��
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy�� M�� d��");
        
        // �ܰ�-5 : LocalDateTime�� ��� �޼���(now)�� Ȱ���Ͽ� ���� ��¥�� ���Ͽ� 
 		// format ��� �޼���� ������ �ۼ��� ��¥ ���� ��ü�� �޼��� ���ڷ� Ȱ���Ͽ� ���� ��¥�� �μ��մϴ�.
 		LocalDateTime localDateTime = LocalDateTime.now();		
 		System.out.println(localDateTime.format(dateTimeFormatter));
 		
 		// �ܰ�-6 : ���Ϸκ��� 100�������� ��¥�� LocalDateTime ��� �޼���(plusDays)�� Ȱ���Ͽ�
		// ������ ���� �����ϰ� �������� �޼���(format)�� Ȱ���Ͽ� ���� ��ü�� ���ڷ� �Է��Ͽ� ���� ��¥�� �μ��մϴ�.
		System.out.println(localDateTime.plusDays(100).format(dateTimeFormatter));
        
    } // main
 
}