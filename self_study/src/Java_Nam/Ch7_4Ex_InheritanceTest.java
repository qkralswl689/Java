package Java_Nam;

class Point extends Object{
	int x;
	int y;
}
//class Circle extends Point{ // ���
//	int r;
//}

class Circle extends Object{ // ����
	
	Point p = new Point(); // ���������� �ʱ�ȭ
	int r;
}

public class Ch7_4Ex_InheritanceTest {

	public static void main(String[] args) {
		
		Circle c = new Circle(); // ��ü ����
		
		System.out.println(c.toString()); 
		
		Circle c2 = new Circle(); // ��ü ����
		System.out.println(c2.toString());

//		// circle ��ü ��� ����
//		c.p.x =1;
//		c.p.y =2;
//		c.r =3;
//		
//		System.out.println("c.p.x = " + c.p.x);
//		System.out.println("c.p.y = " + c.p.y);
//		System.out.println("c.r = " + c.r);

	}

}
