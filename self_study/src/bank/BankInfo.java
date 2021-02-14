package bank;

// 계좌 생성,입금,출금,잔액확인,고객리스트 확인의기능을 하는 프로그램 만들기
// 단 메인클래스에서는 메소드 사용만 가능하다

public class BankInfo {
	
	// 필드 - 함부로 바뀌면 안되는 값이기 떄문에 private를 붙혀준다
	private int clientNumber;
	private String name;
	private String accountNumber;
	private int balance;
	
	// 생성자 - 다른 클래스에서 사용해야 하기 떄문에 getter,setter을 이용한다
	public int getClientNumber() { // 클라이언트 번호 받는 생성자
		return clientNumber; // 클라이언트 번호를 리턴한다
	}
	public void setCliemtNumber(int clientNumber) { // 매개변수 클라이언트넘버를 입력받으면
		this.clientNumber = clientNumber; // 클라이언트넘버에 저장한다
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;		
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override // 오버라이딩
	public String toString() {
		return "고객번호=" + clientNumber + ", 고객이름=" + name + ", 계좌번호"+accountNumber + 
				", 현재잔액=" + balance;
	}

}
