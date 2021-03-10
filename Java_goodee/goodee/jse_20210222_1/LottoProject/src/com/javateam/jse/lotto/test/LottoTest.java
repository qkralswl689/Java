package com.javateam.jse.lotto.test;

import java.util.Arrays;

import com.javateam.jse.lotto.BubbleSort;
import com.javateam.jse.lotto.Lotto;

public class LottoTest {

	public static void main(String[] args) {
		
		// 방법-1 : Java 자체 정렬 사용
		Lotto lotto = new Lotto(); // 로또 객체 생성
		lotto.make(); // 로또 배열 정보 생성
		int []balls = lotto.getBall();
		Arrays.sort(balls); // 오름차순 정렬
		lotto.printLotto(balls); // 로또(복권)정보 출력
		
		System.out.println("\n-----------------");
		
		// 방법-2 : 버블정렬 사용
		Lotto lotto2 = new Lotto(); // 로또 객체 생성
		lotto2.make(); // 로또 배열 정보 생성
		int []balls2 = lotto2.getBall();
		balls2 = BubbleSort.bubbleSort(balls2, "asc"); // 오름차순 정렬
		lotto.printLotto(balls2);// 로또(복권)정보 출력
		
	} // 
}