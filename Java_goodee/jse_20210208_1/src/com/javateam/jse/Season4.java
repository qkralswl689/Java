package com.javateam.jse;

public enum Season4 {
	
	// SPRING,SUMMER,FALL,WINTER;
	SPRING("��",1),SUMMER("����",2),FALL("����",3),WINTER("�ܿ�",4);
	
	private String name;
	private int num;
	
	Season4(String name,int num){
		this.name = name; // ��� �ʵ� <= ����
		this.num = num;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return num;
	}



	public static void main(String[] args) {
		
		Season4 season = Season4.SPRING;
		
//		System.out.println(Season.SPRING);
		// System.out.println(Season.valueOf("SPRING"));
		// System.out.println(season);
		
		System.out.println(Season4.SPRING);
		System.out.println(Season4.SPRING.name);
	 	System.out.println(Season4.SPRING.num);
	 	System.out.println(Season4.SPRING.ordinal());
	 	
	 	System.out.println("------------------");
	 	
	 	Season4 seasons[] = Season4.values();
	 	System.out.println(seasons[0].name);


	}

}
