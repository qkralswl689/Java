package com.javateam.jse;

public class JavaStringTest_answer {

	public static void main(String[] args) {

		String str = "���� ���α׷��� ��κ��� ���̳� ���߿��� "
				   + "���� ���縦 ����ϰ� ���α׷����� ���� �ʰ� "
				   + "���α׷����� ��� �־ �Ѵ�.";
		
		// ���ڿ� str �� ���������� ��ȯ�� �迭 arr�� �־��ش�
		char[] arr = str.toCharArray();
		
		
		int k =0;
		
		for(int i=0; i<6;i++) { // �ݺ�Ƚ��
			for(int j=9-2*i; j>=0; j--) { // j�� 9-2*i ���� 0���� 1�� �����Ѵ�
				System.out.print("  "); // �ι� ����
			}
			for(int j=0; j<=4*i;j++) { // j��0���� 4*i���� 1�� �����ϸ鼭 �ݺ��Ѵ�
				System.out.print(arr[k]); // �迭 arr�� k(0)�ε��� ���� ���
				if(k<arr.length-1) { // ���࿡ k(�ε���)��  �迭�� ���̿��� -1 �� ���� �۴ٸ�
					k++; // �ε���(k)�� 1�� �þ��
				}else { // �ƴ϶��
					break; // �����
				}
			}System.out.println();
			
			// �迭�� ġȯ ���ϰ� ����ϴ� ���
			
//			for(int j=0; j<=4*i;j++) { // j��0���� 4*i���� 1�� �����ϸ鼭 �ݺ��Ѵ�
//				System.out.print(str.charAt(k)); // str�� ���������� ��ȯ�Ͽ� k(0)�ε��� ���� ���
//				if(k<str.length()-1) { // ���࿡ k(�ε���)�� ���ڿ� str�� �����̿��� -1 ������ �۴ٸ�
//					k++; // �ε���(k)�� 1�� �þ��
//				}else { // �ƴϸ�
//					break; // �����
//				}
//			}System.out.println();
			
		}
 		
		
		
	}

}


