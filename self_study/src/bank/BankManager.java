package bank;

import java.util.Scanner;

public class BankManager {
	
	Scanner sc = new Scanner(System.in);
	private BankInfo info;
	private BankInfo[] bankList = new BankInfo[100];
	private int clientNumber = 0;
	private int count = 0;
	private int index;
	
	public void showMenu() {
		System.out.println("==========================================");
		System.out.println("|1.���¼���|2.�Ա�|2.���|4.�ܾ�|5.������Ʈ|6.����|");
		System.out.println("==========================================");
		System.out.print("����>");
	}
	public String menuSel() {
		String sel = sc.next();
		return sel;
}
	public void createAccount() {
		System.out.println("***************");
		System.out.println("�ű� ���¸� �����մϴ�.");
		info = new BankInfo();
		clientNumber = clientNumber +1;
		info.setCliemtNumber(clientNumber);
		System.out.print("�̸�:");
		String name = sc.next();
		info.setName(name);
		String accountNumber = null;
		for(int i=0; i<bankList.length; i++) {
			int same = -1;
			System.out.print("���¹�ȣ");
			accountNumber = sc.next();
			for(int j=0;j<bankList.length; j++) {
				if(bankList[j] != null) {
					if(accountNumber.equals(bankList[j].getAccountNumber())) {
						// �Է¹��� ���¹�ȣ accountNumber �� �迭�� ��� ���¹�ȣ bankList[j].getAccountNumber ��
						System.out.println("������ ���°� �����մϴ�. �ٽ� �Է����ּ���");
						same = j;
						break;
					}
				}
			}
			if(same >= 0) {
				i = -1;
				continue;
			}
			break;
		}
	}
	
	

}
