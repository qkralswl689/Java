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
		System.out.println("|1.계좌성성|2.입금|2.출금|4.잔액|5.고객리스트|6.종료|");
		System.out.println("==========================================");
		System.out.print("선택>");
	}
	public String menuSel() {
		String sel = sc.next();
		return sel;
}
	public void createAccount() {
		System.out.println("***************");
		System.out.println("신규 계좌를 생성합니다.");
		info = new BankInfo();
		clientNumber = clientNumber +1;
		info.setCliemtNumber(clientNumber);
		System.out.print("이름:");
		String name = sc.next();
		info.setName(name);
		String accountNumber = null;
		for(int i=0; i<bankList.length; i++) {
			int same = -1;
			System.out.print("계좌번호");
			accountNumber = sc.next();
			for(int j=0;j<bankList.length; j++) {
				if(bankList[j] != null) {
					if(accountNumber.equals(bankList[j].getAccountNumber())) {
						// 입력받은 계좌번호 accountNumber 와 배열에 담긴 계좌번호 bankList[j].getAccountNumber 비교
						System.out.println("동일한 계좌가 존재합니다. 다시 입력해주세요");
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
