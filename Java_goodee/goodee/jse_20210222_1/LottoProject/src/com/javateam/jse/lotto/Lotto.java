package com.javateam.jse.lotto;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 복권(lotto) VO 객체
 * 
 * @author javateam
 *
 */
public class Lotto
{	
	private int[] ball; // 로또 배열 정보
	
	public Lotto(){
		ball = new int[6]; // 배열 생성
	}
	
	public int[] getBall(){
		return ball;
	}
	
	/**
	 * 배열과 특정 수의 동등 여부 판단
	 * 
	 * ex) {4,6,1,8,7,9} 안의 수와  
	 *      5를 비교하면 false
	 *      6과 비교하면 true 
	 *      
	 * @param a 번호 배열 인자
	 * @param b 비교 인자
	 * @return 동등 여부 인자
	 */
	private boolean isSame(int [] a, int b) {
		
		boolean flag = false;
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]==b){
				flag=true;
				break;
			}
		} // 
		
		return flag;
	} // 
	
	/**
	 * 원하는 수의 로또 배열 만들기 
	 */
	public void make(){
		
		int count=0;
		
		while(true){ // 무한 반복문
			
			// 무작위수 : Math.random()  
			// 0<=n<1까지 실수
			int b=(int)(Math.random()*45)+1; 
			
			if(!isSame(ball,b)){
				ball[count++]=b;
			}
			
			if(count==6)
				 break; // 조건 분기
		} // while
	} //
	
	/**
	 * 로또 배열 정보 출력
	 * : Java 1.8 이상 함수형 프로그래밍 방식으로 출력
	 * 
	 * @param arr 출력할 로또 배열 정보
	 */
	public void printLotto(int [] arr) {
		
		/*
		 * for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]+", ");
		   }
		 */
		
		// int [] -> ArrayList<Integer> 변환
		Arrays.stream(arr)
			  .boxed()
			  .collect(Collectors.toList())
			  .forEach(x->System.out.print(x+" "));
	} // 
	
} // VO