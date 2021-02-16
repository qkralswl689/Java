package company;

// abstract 업무강도 낮춤(사원 -> 주임)
abstract public class Clerk extends Manager {
	
	// 기본 생성자 => 아무것도 안해도 호출된다
	public Clerk() {
		super("홍길동");
		System.out.println("사원의 일");
	}

	@Override
	public void orderFromManager() {
		
		System.out.println("사원이 orderFromManager를 구현하다");
	}

//	@Override
//	public void orderFromDirector() {
//		super.orderFromDirector();
//		// this.orderFromDirector(); // 부적절한 재귀호출
//		// StackOverflowError !
//		System.out.println("사원이 orderFromManager를 구현하다");
//	}

	@Override
	public void orderFromSubDirector() {
		System.out.println("사원이 orderFromSubDirector를 구현하다");
	}

	@Override
	// 일반 메서드 여서 오버라이딩 해도 되고 안해도 된다
	public void workByManager() {
		// super.workByManager();
		System.out.println("과장님 개인일을 사원이 같이 하다");
	}



	
	
	
	

}
