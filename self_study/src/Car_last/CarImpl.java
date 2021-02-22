package Car_last;

import Car_last.Body;
import Car_last.Engine;
import Car_last.Wheel;

public class CarImpl implements Car {
	
	Body body;
	Engine engine;
	Wheel wheel;

	public CarImpl() {
		
	}
	
	public CarImpl(Body body,Engine engine,Wheel wheel) {
		this.body = body;
		this.engine = engine;
		this.wheel = wheel;
	}
	
	@Override
	public void combineEngine() {
		
		engine.combine();
	}

	@Override
	public void combineBody() {
		body.combine();
	}

	@Override
	public void combineWheel() {
		wheel.comboine();
	}

	@Override
	public void compleateCar() {
		this.combineBody();
		this.combineEngine();
		this.combineWheel();
		System.out.println("차량제작을 완성하였습니다");
	}

}
