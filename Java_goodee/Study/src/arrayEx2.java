
public class arrayEx2 {

	public static void main(String[] args) {
		char[] ch = {'S', 'o', 'l', 'd', 'e', 's', 'k'};
		int size = ch.length; 
		System.out.println(size);
		
		// �빮��, �ҹ��� ������ ���� ���Ͻÿ�
		int count1 = 0;
		int count2 = 0;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]<'a') {
				count1++;
			}else {
				
			}count2++;
			
		}System.out.println("�빮���� ������" + count1);
		System.out.println("�빮���� ������" + count2);
		
		// ������ ������ ���Ͻÿ� 'i','e'
		
		int count3 = 0;
		int count4 = 0;
		for(int i =0; i<ch.length; i++) {
			if(ch[i] == 'A' || ch[i] == 'i' || ch[i]== 'E' || ch[i] == 'e') {
				count3++;
			}else if (ch[i] =='A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'U') {
				count3++;
			}else {
				count4++;
			}
			

		}
		System.out.println("����" + count3);
		System.out.println("����" + count4);
		
		// ��ҹ��ڸ� ���� �ٲ㼭 ����Ͻÿ�
		for(int i =0; i<size; i++) {
			if(ch[i] <'a') {
				System.out.println((char)(ch[i]+32));
			}else {
				System.out.println((char)(ch[i]-32));
			}
		}
//		int[] num = {1,2,3,4,5};
//		int num2 = num.length;


	}

}
