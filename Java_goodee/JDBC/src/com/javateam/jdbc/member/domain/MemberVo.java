package com.javateam.jdbc.member.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;
/**
 * Member ���̺� �����Ǵ� ��ƼƼ(Entity) �ڹٺ�(javaBean) 
 * : VO(�� ��ü) : POJP(Plain Old Java Object) ���� 
 * : Plain => metadata(xml, annotation ��)�� ���� �����ϰ� �ڹ� �ڵ常���� ���� �Ǿ��ִ°�
 * : Old => EJB Entity Bean(XML base) ex) EJB 3.0�� annotation ���� �� ���� �������
 *  => VO �� �־�� ������ ������ �����ϴ�
 *    
 *
 * @author mingki
 * @version 1.0
 *
 */
public class MemberVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // �ø��� ������ȣ
	
	// ��� �ʵ�
	/** ȸ�� ���̵� */
	private String memberId;
	/** ȸ�� �н����� */
	private String memberPassword;
	/** ȸ�� �г��� */
	private String memberNicname;
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

	// �⺻ ������ / �����ε� ������ �ۼ�
	
	public MemberVo(){
		// �⺻������ => �����ε� �����ڰ� ������� �ۼ� �ʼ�! -> �ۼ� x : �����߻�
	} 
	
	// �����ε� ������ �ۼ�
	public MemberVo(String memberId, String memberPassword, String memberNicname, String memberName, char memberGender,
			String memberEmail, String memberPhone, Date memberJoindate) {
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberNicname = memberNicname;
		this.memberName = memberName;
		this.memberGender = memberGender;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberJoindate = memberJoindate;
	}
	public MemberVo(String memberId, String memberPassword, String memberNicname, String memberName, char memberGender,
			String memberEmail, String memberPhone, Date memberBirth, String memberZip, String memberAddressBasic,
			String memberAddressDetail, Date memberJoindate) {
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberNicname = memberNicname;
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
	public String getMemberNicname() {
		return memberNicname;
	}
	public void setMemberNicname(String memberNicname) {
		this.memberNicname = memberNicname;
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
	
	// toString overriding

	@Override
	public String toString() {
		return String.format(
				"memberId=%s%n, memberPassword=%s%n, memberNicname=%s%n, memberName=%s%n, memberGender=%s%n, memberEmail=%s%n, memberPhone=%s%n, memberBirth=%s%n, memberZip=%s%n, memberAddressBasic=%s%n, memberAddressDetail=%s%n, memberJoindate=%s]",
				memberId, memberPassword, memberNicname, memberName, memberGender, memberEmail, memberPhone,
				memberBirth, memberZip, memberAddressBasic, memberAddressDetail, memberJoindate);
	}

	// hashcode/equals overriding
	
	@Override
	public int hashCode() {
		return Objects.hash(memberAddressBasic, memberAddressDetail, memberBirth, memberEmail, memberGender, memberId,
				memberJoindate, memberName, memberNicname, memberPassword, memberPhone, memberZip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVo other = (MemberVo) obj;
		return Objects.equals(memberAddressBasic, other.memberAddressBasic)
				&& Objects.equals(memberAddressDetail, other.memberAddressDetail)
				&& Objects.equals(memberBirth, other.memberBirth) && Objects.equals(memberEmail, other.memberEmail)
				&& memberGender == other.memberGender && Objects.equals(memberId, other.memberId)
				&& Objects.equals(memberJoindate, other.memberJoindate) && Objects.equals(memberName, other.memberName)
				&& Objects.equals(memberNicname, other.memberNicname)
				&& Objects.equals(memberPassword, other.memberPassword)
				&& Objects.equals(memberPhone, other.memberPhone) && Objects.equals(memberZip, other.memberZip);
	}

	
	
	
	
	
}
