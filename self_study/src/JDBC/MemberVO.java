package JDBC;

import java.sql.Date;
import java.util.Objects;

// MemberVO : 데이터 전송 가능하게 만듬
public class MemberVO {

	// 멤버 필드
	/** 회원 아이디 */
	private String memberId;
	/** 회원 패스워드 */
	private String memberPassword;
	/** 회원 닉네임 */
	private String memberNickname;
	/** 회원 이름 */
	private String memberName;
	/** 회원 성별 */
	private char memberGender;
	/** 회원 이메일 */
	private String memberEmail;
	/** 회원 핸드폰번호 */
	private String memberPhone;
	/** 회원 생일*/
	private Date memberBirth;
	/** 회원 우편번호 */
	private String memberZip;
	/** 회원 기본주소  */
	private String memberAddressBasic;
	/** 회원 상세주소 */
	private String memberAddressDetail;
	/** 회원 가입일 */
	private Date memberJoindate;

	// 기본생성자 
	MemberVO(){}
	
	// 오버로딩 생성자
	public MemberVO(String memberId, String memberPassword, String memberNickname, String memberName, char memberGender,
			String memberEmail, String memberPhone, Date memberJoindate) {
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberNickname = memberNickname;
		this.memberName = memberName;
		this.memberGender = memberGender;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberJoindate = memberJoindate;
	}
	public MemberVO(String memberId, String memberPassword, String memberNickname, String memberName, char memberGender,
			String memberEmail, String memberPhone, Date memberBirth, String memberZip, String memberAddressBasic,
			String memberAddressDetail, Date memberJoindate) {
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberNickname = memberNickname;
		this.memberName = memberName;
		this.memberGender = memberGender;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberBirth = memberBirth;
		this.memberZip = memberZip;
		this.memberAddressBasic = memberAddressBasic;
		this.memberAddressDetail = memberAddressDetail;
		this.memberJoindate = memberJoindate;
	}

	// getter/setter
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public char getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(char memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public Date getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(Date memberBirth) {
		this.memberBirth = memberBirth;
	}

	public String getMemberZip() {
		return memberZip;
	}

	public void setMemberZip(String memberZip) {
		this.memberZip = memberZip;
	}

	public String getMemberAddressBasic() {
		return memberAddressBasic;
	}

	public void setMemberAddressBasic(String memberAddressBasic) {
		this.memberAddressBasic = memberAddressBasic;
	}

	public String getMemberAddressDetail() {
		return memberAddressDetail;
	}

	public void setMemberAddressDetail(String memberAddressDetail) {
		this.memberAddressDetail = memberAddressDetail;
	}

	public Date getMemberJoindate() {
		return memberJoindate;
	}

	public void setMemberJoindate(Date memberJoindate) {
		this.memberJoindate = memberJoindate;
	}

	// toString
	@Override
	public String toString() {
		return String.format(
				"memberId=%s, memberPassword=%s, memberNickname=%s, memberName=%s, memberGender=%s, memberEmail=%s, memberPhone=%s, memberBirth=%s, memberZip=%s, memberAddressBasic=%s, memberAddressDetail=%s, memberJoindate=%s]",
				memberId, memberPassword, memberNickname, memberName, memberGender, memberEmail, memberPhone,
				memberBirth, memberZip, memberAddressBasic, memberAddressDetail, memberJoindate);
	}

	// hashCode / equals
	@Override
	public int hashCode() {
		return Objects.hash(memberAddressBasic, memberAddressDetail, memberBirth, memberEmail, memberGender, memberId,
				memberJoindate, memberName, memberNickname, memberPassword, memberPhone, memberZip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(memberAddressBasic, other.memberAddressBasic)
				&& Objects.equals(memberAddressDetail, other.memberAddressDetail)
				&& Objects.equals(memberBirth, other.memberBirth) && Objects.equals(memberEmail, other.memberEmail)
				&& memberGender == other.memberGender && Objects.equals(memberId, other.memberId)
				&& Objects.equals(memberJoindate, other.memberJoindate) && Objects.equals(memberName, other.memberName)
				&& Objects.equals(memberNickname, other.memberNickname)
				&& Objects.equals(memberPassword, other.memberPassword)
				&& Objects.equals(memberPhone, other.memberPhone) && Objects.equals(memberZip, other.memberZip);
	}
	
	
}
