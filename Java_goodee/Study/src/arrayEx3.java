
public class arrayEx3 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int size = num.length;
		int sum =0;
		
		// num �迭 ����� ��ü ��
		for(int i =0; i<size; i++) {
			sum +=num[i];
			
		}System.out.println(sum);
		
		// �ִ밪, �ּҰ�
		int max = num[0];
		int min = num[0];
		for(int i=0; i<size; i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min = num[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
