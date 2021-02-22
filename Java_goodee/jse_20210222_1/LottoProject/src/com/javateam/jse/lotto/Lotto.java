package com.javateam.jse.lotto;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * ����(lotto) VO ��ü
 * 
 * @author javateam
 *
 */
public class Lotto
{	
	private int[] ball; // �ζ� �迭 ����
	
	public Lotto(){
		ball = new int[6]; // �迭 ����
	}
	
	public int[] getBall(){
		return ball;
	}
	
	/**
	 * �迭�� Ư�� ���� ���� ���� �Ǵ�
	 * 
	 * ex) {4,6,1,8,7,9} ���� ����  
	 *      5�� ���ϸ� false
	 *      6�� ���ϸ� true 
	 *      
	 * @param a ��ȣ �迭 ����
	 * @param b �� ����
	 * @return ���� ���� ����
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
	 * ���ϴ� ���� �ζ� �迭 ����� 
	 */
	public void make(){
		
		int count=0;
		
		while(true){ // ���� �ݺ���
			
			// �������� : Math.random()  
			// 0<=n<1���� �Ǽ�
			int b=(int)(Math.random()*45)+1; 
			
			if(!isSame(ball,b)){
				ball[count++]=b;
			}
			
			if(count==6)
				 break; // ���� �б�
		} // while
	} //
	
	/**
	 * �ζ� �迭 ���� ���
	 * : Java 1.8 �̻� �Լ��� ���α׷��� ������� ���
	 * 
	 * @param arr ����� �ζ� �迭 ����
	 */
	public void printLotto(int [] arr) {
		
		/*
		 * for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]+", ");
		   }
		 */
		
		// int [] -> ArrayList<Integer> ��ȯ
		Arrays.stream(arr)
			  .boxed()
			  .collect(Collectors.toList())
			  .forEach(x->System.out.print(x+" "));
	} // 
	
} // VO