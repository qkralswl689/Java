package com.javateam.math;

public class MathDemo {
	
	// ���� �ۼ��� ���	
	public  MathDemo(){ //�ۼ��� �ʿ� X
			
		}
	
	InnerMath inner; // �ۼ��� �ʿ� X
	
	public static class InnerMath{
		
						
		public InnerMath() { // �ۼ��� �ʿ� X
			
			
		}
		
		public static float getArea(int i) {
			return 314; // (float) (i*i*Math.PI); => ���� ���� ���ϴ� ����
			
		};
	}
	
	// ����� ���
//	package com.javateam.math;
//
//	public class MathDemo {
//		
//		public static class InnerMath {
//			
//			public static float getArea(int r) {
//				
//				return (float) (r*r*Math.PI);
//			} // 
//		}
//
//	}
	

}
