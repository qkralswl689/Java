package company.test;

import company.Clerk;
import company.Clerk2;
import company.Director;
import company.Manager;



public class Test {

	public static void main(String[] args) {
		
//		Director job1 = new Clerk();
//		job1.orderFromDirector();	
		
		Manager job2 = new Clerk2();
		// job2.orderFromManager();
		job2.orderFromDirector();
		
	}

}
