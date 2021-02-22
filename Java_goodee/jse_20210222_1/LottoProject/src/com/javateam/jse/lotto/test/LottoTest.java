package com.javateam.jse.lotto.test;

import java.util.Arrays;

import com.javateam.jse.lotto.BubbleSort;
import com.javateam.jse.lotto.Lotto;

public class LottoTest {

	public static void main(String[] args) {
		
		// ���-1 : Java ��ü ���� ���
		Lotto lotto = new Lotto(); // �ζ� ��ü ����
		lotto.make(); // �ζ� �迭 ���� ����
		int []balls = lotto.getBall();
		Arrays.sort(balls); // �������� ����
		lotto.printLotto(balls); // �ζ�(����)���� ���
		
		System.out.println("\n-----------------");
		
		// ���-2 : �������� ���
		Lotto lotto2 = new Lotto(); // �ζ� ��ü ����
		lotto2.make(); // �ζ� �迭 ���� ����
		int []balls2 = lotto2.getBall();
		balls2 = BubbleSort.bubbleSort(balls2, "asc"); // �������� ����
		lotto.printLotto(balls2);// �ζ�(����)���� ���
		
	} // 
}