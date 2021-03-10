package com.javateam.jse;

public enum Season {
	
	// SPRING, SUMMER, FALL, WINTER; 
	SPRING("봄", 1), SUMMER("여름", 2), FALL("가을", 3), WINTER("겨울", 4);
	
	private String name;
	private int num;
	
	Season(String name, int num) {
		this.name = name; // 멤버 필드 <= 인자
		this.num = num;
	}

	public String getName() {
		return name;
	}
 
	public int getNum() {
		return num;
	}

	public static void main(String[] args) {
		
		// Season season = Season.SPRING;
		// System.out.println(season);
		
		// System.out.println(Season.SPRING);
		// System.out.println(Season.valueOf("SPRING"));
		
		System.out.println(Season.SPRING);
		System.out.println(Season.SPRING.name);
		System.out.println(Season.SPRING.num);
		System.out.println(Season.SPRING.ordinal());
		
		System.out.println("------------------");
		
		Season seasons[] = Season.values(); 
		
		System.out.println(seasons[0].name);
		
	}
	
}