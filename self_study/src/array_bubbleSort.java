import java.util.*;

public class array_bubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt(); // �迭�ȿ� ���� �Է°� �־��ֱ�
		}
		// ��������
		int temp; // ���� �ڸ� �ٲ��ִ�(����Ī)���� ����
		for(int i=0; i<arr.length; i++) { // 1~6ȸ�� �ݺ� => i : ȸ��
			for(int j =1; j<arr.length-i; j++) { // ���� ���� �� => j : ȸ������ ������ ���� ��
				// j -0 �ϸ� �ε��� ������ ����Ƿ� j ���۰� 1�� �����Ѵ�
				if(arr[j-1]>arr[j] ) { // j-1 �� j���� ũ�� �� ���� �ٲ��ش�
					temp = arr[j-1]; // temp �� �������� ��´�
					arr[j-1] = arr[j]; // ���� ������ �������� ����ְ�
					arr[j] = temp; // temp�� ū���� �ٽ� ����ش�
					System.out.println(temp);
				}
			}
		}
		
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
	}

}
