package com.javateam.jse;

public class CheckPrimeImpl implements CheckPrime {

	public CheckPrimeImpl() {
		
	}
	@Override
	public boolean isPrimeNum(int num) {
		boolean flag = true;
	
//		if(j<=(int)Math.sqrt(num)) {
////			return num % j==0;
//			if(num % j==0) {
//				return flag;			
//			}else if(num % j != 0) {
//				 return ;
//			}else {
//				
//			}
//		
//		}
		
		// °­»ç´Ô ´ä¾È
		for(int j = 2;j<=(int)Math.sqrt(num);j++) {
			if(num%j == 0) {
				flag = false;
				break;
			}else {
				flag = true;
			}
		}
		
		return flag;

	}

}
