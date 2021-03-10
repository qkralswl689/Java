package company;

// 다중 상속 (multiple inheritance)
// 클래스에서는 단일 상속만 가능하고 인터페이스에서는 다중 상속이 가능하다
public interface Director extends President,VicePresident {
	
	void orderFromDirector();

	void orderFromDirector2();
	


}
