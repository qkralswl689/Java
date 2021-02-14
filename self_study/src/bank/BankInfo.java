package bank;

// ���� ����,�Ա�,���,�ܾ�Ȯ��,������Ʈ Ȯ���Ǳ���� �ϴ� ���α׷� �����
// �� ����Ŭ���������� �޼ҵ� ��븸 �����ϴ�

public class BankInfo {
	
	// �ʵ� - �Ժη� �ٲ�� �ȵǴ� ���̱� ������ private�� �����ش�
	private int clientNumber;
	private String name;
	private String accountNumber;
	private int balance;
	
	// ������ - �ٸ� Ŭ�������� ����ؾ� �ϱ� ������ getter,setter�� �̿��Ѵ�
	public int getClientNumber() { // Ŭ���̾�Ʈ ��ȣ �޴� ������
		return clientNumber; // Ŭ���̾�Ʈ ��ȣ�� �����Ѵ�
	}
	public void setCliemtNumber(int clientNumber) { // �Ű����� Ŭ���̾�Ʈ�ѹ��� �Է¹�����
		this.clientNumber = clientNumber; // Ŭ���̾�Ʈ�ѹ��� �����Ѵ�
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
	
	@Override // �������̵�
	public String toString() {
		return "����ȣ=" + clientNumber + ", ���̸�=" + name + ", ���¹�ȣ"+accountNumber + 
				", �����ܾ�=" + balance;
	}

}
