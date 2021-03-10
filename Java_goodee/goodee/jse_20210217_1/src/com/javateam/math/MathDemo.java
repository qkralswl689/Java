package com.javateam.math;

public class MathDemo {
	
	// 내가 작성한 답안	
	public  MathDemo(){ //작성할 필요 X
			
		}
	
	InnerMath inner; // 작성할 필요 X
	
	public static class InnerMath{
		
						
		public InnerMath() { // 작성할 필요 X
			
			
		}
		
		public static float getArea(int i) {
			return 314; // (float) (i*i*Math.PI); => 원의 면적 구하는 공식
			
		};
	}
	
	// 강사님 답안
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
