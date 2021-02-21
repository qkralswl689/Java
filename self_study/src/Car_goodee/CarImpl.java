package Car_goodee;

import Car_goodee.Body;
import Car_goodee.Engine;
import Car_goodee.Wheel;
public class CarImpl implements Car {
	
	Body body;
	Wheel wheel;
	Engine engine;
	
	public CarImpl() {
	}
	
	public CarImpl(Body body,
						Engine engine,
						Wheel wheel) {
		this.body = body;
		this.engine = engine;
		this.wheel =wheel;
		
			
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
		wheel.combine();
	}

	@Override
	public void complateCar() {
		this.combineBody();
		this.combineEngine();
		this.combineWheel();
		System.out.println("차량 조립 완료!");
	}

}
