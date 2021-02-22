package com.javateam.jse.lotto;

/**
 * ��������
 * ���� : http://terms.naver.com/entry.nhn?docId=2270437&cid=51173&categoryId=51173
 * @author javateam
 *
 */
public class  BubbleSort
{
	 /**
     * ���� ���� �޼���
     *
     * @param arr ������ �迭 ex) int [] arr={2,0,1,6,8,4,7};
     * @param ascFlag ��������(asc)/��������(desc) ����
     * @return ���ĵ� �迭
     */
    public static int[] bubbleSort(int []arr, String ascFlag){
          
       int n=arr.length;
      
       if (n<=0) {
           return new int[0];
       }
      
       // ����
       for (int i=0;i<n-1;i++){
          
           // �ڵ� �ۼ� ����
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
          
         // �ڵ� �ۼ� ��
          
       } // for i
          
       return arr;
   }
	
}