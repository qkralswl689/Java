package Car;

import Car.Body;
import Car.Wheel;
import Car.Engine;


public class CarImpl implements Car {
	
	Body body;
	Wheel wheel;
	Engine engine;
	
	public CarImpl() {
		
	}
	public CarImpl(Body body,
					Wheel wheel,
					Engine engine) { 
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
		wheel.combine();
	}

	@Override
	public void compleateCar() {
		this.combineBody();
		this.combineEngine();
		this.combineWheel();
		System.out.println("차량 완성!");
	}

}
