package VO;

import java.util.Objects;

public class MemberVO2 {
	
	// �ʵ� ����  
	private String id;
	private String pw;
	private String address;
	private String name;
	
	// �⺻ ������ ����
	public MemberVO2() {
		
	}
	
	// �����ε� ������ ����
	
	public MemberVO2(String id,String pw,String address, String name) {
		this.id = id;
		this.pw = pw;
		this.name= name;
		this.address = address;
	}

	// getter setter �޼ҵ� ����
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// �������̵� 
	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, pw);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO2 other = (MemberVO2) obj;
		return Objects.equals(address, other.address) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(pw, other.pw);
	}
	
	
	

}
