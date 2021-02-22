package VO;

import java.util.Objects;

public class MemberVO {
	
	// 필드 생성
	private String id;
	private String pw;
	private String name;
	private String address;
	
	
	// 기본생성자 생성
	public MemberVO() {
		
	}
	
	// 오버로딩 생성사 생성
	public MemberVO(String id, String pw, String name, String address) {
		// super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.address = address;
	}

	// getter,setter생성 => 메소드 생성
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

	// hashCode() 오버라이딩  => 멤버 필드 비교
	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, pw);
	}
	// hashCode() 오버라이딩  => 멤버 필드 비교
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(address, other.address) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(pw, other.pw);
	}

	
	// hashCode() 오버라이딩  => 멤버 필드 비교
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((address == null) ? 0 : address.hashCode());
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
//		return result;
//	}
//
//	// hashCode() 오버라이딩 => 멤버 필드 비교
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof MemberVO)) {
//			return false;
//		}
//		MemberVO other = (MemberVO) obj;
//		if (address == null) {
//			if (other.address != null) {
//				return false;
//			}
//		} else if (!address.equals(other.address)) {
//			return false;
//		}
//		if (id == null) {
//			if (other.id != null) {
//				return false;
//			}
//		} else if (!id.equals(other.id)) {
//			return false;
//		}
//		if (name == null) {
//			if (other.name != null) {
//				return false;
//			}
//		} else if (!name.equals(other.name)) {
//			return false;
//		}
//		if (pw == null) {
//			if (other.pw != null) {
//				return false;
//			}
//		} else if (!pw.equals(other.pw)) {
//			return false;
//		}
//		return true;
//	}
//
//	// toString 오버라이딩 (Custom)
//	@Override
//	public String toString() {
//		return String.format("id=%s, pw=%s, name=%s, address=%s", id, pw, name, address);
//	}
//	

	
	
	// toString 오버라이딩 (format)
//	@Override
//	public String toString() {
//		return String.format("MemberVO [id=%s, pw=%s, name=%s, address=%s]", id, pw, name, address);
//	}

	
	
	// toString 오버라이딩 (builder chained) 
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("MemberVO [id=").append(id).append(", pw=").append(pw).append(", name=").append(name)
//				.append(", address=").append(address).append("]");
//		return builder.toString();
//	}

	// toString 오버라이딩 (builder)
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("MemberVO [id=");
//		builder.append(id);
//		builder.append(", pw=");
//		builder.append(pw);
//		builder.append(", name=");
//		builder.append(name);
//		builder.append(", address=");
//		builder.append(address);
//		builder.append("]");
//		return builder.toString();
//	}

	// toString 오버라이딩(concatenation)=> getter를 여러번 쓰는것과 같은 효과
//	@Override
//	public String toString() {
//		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", address=" + address + "]";
//	}
	
	

}
