package Car;
import Car.Body;
import Car.Engine;
import Car.Wheel;

// 2. Car인터페이스 구현 클래스를 작성하되 오버라이딩 되는 메서드들을 작성한다
// 메서드의 구현부는 일단 놓아두고 다른 클래스들을 작성한 이후에 완성한다
// 4. 다시 CarImpl 구현 클래스로 돌아와서 오버로딩 생성자에 위에서 작성한 부분품 클래스들을 활용하여 코드를 완성
// 자동차 조립 구현 클래스
public class CarImpl implements CarInterface {
	
	// 4-1.각 자동차 조립과 관련된 멤버 메서드들은 has-a 관계로 설정된 각각 해당되는 부속품 클래스들의 멤버 메서드들을 호출하도록 조치합니다.
	// has-a 관계
	Body body; // 차체
	Engine engine; // 엔진
	Wheel wheel; // 바퀴

	public CarImpl() { // 생성자
		
	}
	
	// 오버로딩 생성자
	public CarImpl(Body body,
					Engine engine,
					Wheel wheel) {
		
		// 이부분에서 인자 멤버필드에 대입하지 않을 경우
		// NullPointerException 발생!
		this.body = body;
		this.engine = engine;
		this.wheel = wheel;		
	}
	
	@Override
	public void combineEngine() { // 엔진 조립
		engine.combine();		
	}

	@Override
	public void combineBody() { // 차체 조립
		body.combine();

	}

	@Override
	public void combineWheel() { // 바퀴조립
		wheel.combine();
	}

	// 4-2.최종 조립을 완성하는 completeCar 메서드에서는 위에서 구현한 자신의 멤버 메서드들을 다시 호출하고 "차량 제작을 완성하였습니다." 라는 메시지로 마감처리하여 완성하도록 합니다.      
	@Override
	public void completeCar() { // 자동차 조립완성
		this.combineBody();
		this.combineEngine();
		this.combineWheel();
		System.out.println("차량 제작을 완성 하였습니다");
	}
}
	


