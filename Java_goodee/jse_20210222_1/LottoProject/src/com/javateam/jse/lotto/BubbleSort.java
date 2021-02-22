package com.javateam.jse.lotto;

/**
 * 버블정렬
 * 참고 : http://terms.naver.com/entry.nhn?docId=2270437&cid=51173&categoryId=51173
 * @author javateam
 *
 */
public class  BubbleSort
{
	 /**
     * 버블 정렬 메서드
     *
     * @param arr 정렬할 배열 ex) int [] arr={2,0,1,6,8,4,7};
     * @param ascFlag 오름차순(asc)/내림차순(desc) 여부
     * @return 정렬된 배열
     */
    public static int[] bubbleSort(int []arr, String ascFlag){
          
       int n=arr.length;
      
       if (n<=0) {
           return new int[0];
       }
      
       // 시작
       for (int i=0;i<n-1;i++){
          
           // 코드 작성 시작
           for (int j=0;j<n-1-i;j++){
              
               if (ascFlag.equals("asc") &&
                  (arr[j]>arr[j+1])) {  
                  
                   int temp=arr[j+1];  
                   arr[j+1]=arr[j];
                   arr[j]=temp;
                  
               } else if (ascFlag.equals("desc") &&
                         (arr[j]<arr[j+1])) {  
                  
                   int temp=arr[j+1];  
                   arr[j+1]=arr[j];
                   arr[j]=temp;
               } // if
          
           } // for j
          
         // 코드 작성 끝
          
       } // for i
          
       return arr;
   }
	
}