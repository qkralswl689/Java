package JDBC;

import java.sql.Date;
import java.util.Objects;

// MemberVO : ������ ���� �����ϰ� ����
public class MemberVO {

	// ��� �ʵ�
	/** ȸ�� ���̵� */
	private String memberId;
	/** ȸ�� �н����� */
	private String memberPassword;
	/** ȸ�� �г��� */
	private String memberNickname;
	/** ȸ�� �̸� */
	private String memberName;
	/** ȸ�� ���� */
	private char memberGender;
	/** ȸ�� �̸��� */
	private String memberEmail;
	/** ȸ�� �ڵ�����ȣ */
	private String memberPhone;
	/** ȸ�� ����*/
	private Date memberBirth;
	/** ȸ�� �����ȣ */
	private String memberZip;
	/** ȸ�� �⺻�ּ�  */
	private String memberAddressBasic;
	/** ȸ�� ���ּ� */
	private String memberAddressDetail;
	/** ȸ�� ������ */
	private Date memberJoindate;

	// �⺻������ 
	MemberVO(){}
	
	// �����ε� ������
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
