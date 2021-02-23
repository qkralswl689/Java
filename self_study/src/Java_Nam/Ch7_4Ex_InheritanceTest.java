package Java_Nam;

class Point extends Object{
	int x;
	int y;
}
//class Circle extends Point{ // 상속
//	int r;
//}

class Circle extends Object{ // 포함
	
	Point p = new Point(); // 참조변수의 초기화
	int r;
}

public class Ch7_4Ex_InheritanceTest {

	public static void main(String[] args) {
		
		Circle c = new Circle(); // 객체 생성
		
		System.out.println(c.toString()); 
		
		Circle c2 = new Circle(); // 객체 생성
		System.out.println(c2.toString());

//		// circle 객체 멤버 접근
//		c.p.x =1;
//		c.p.y =2;
//		c.r =3;
//		
//		System.out.println("c.p.x = " + c.p.x);
//		System.out.println("c.p.y = " + c.p.y);
//		System.out.println("c.r = " + c.r);

	}

}
