package domain;

public class MemberVO {
	
	private String id;;
	private String pw;
	private String name;
	private String address;

	// getter (get으로 시작하는method)
	public String getId() {
		return this.id;
	}
	
	// setter (set으로 시작하는 method)
	public void setId(String id) {
		this.id = id;
	}
	
	// Source메뉴 - Generate Getter and Setters 이용해서 생성 할 수 있다
	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
