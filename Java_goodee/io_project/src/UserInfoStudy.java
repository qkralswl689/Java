public class UserInfoStudy implements java.io.Serializable {
	String name;
	transient String password; // transient : 직렬화 하지 않는 명령
	int age;

	public UserInfoStudy() {
		this("Unknown", "1111", 0);
	}

	public UserInfoStudy(String name, String password, int age) {
		this.name = name;	
		this.password = password;	
		this.age = age;	
	}

	public String toString() {
		return "("+ name + "," + password + "," + age + ")";
	}
}
