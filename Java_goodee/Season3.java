package com.javateam.jse;

public enum Season3 {
	
	// SPRING, SUMMER, FALL, WINTER; 
	// SPRING("º½", 1), SUMMER("¿©¸§", 2), FALL("°¡À»", 3), WINTER("°Ü¿ï", 4);
	º½("spring", 1), ¿©¸§("summer", 2), °¡À»("fall", 3), °Ü¿ï("winter", 4);
	
	private String name;
	private int num;
	
	Season3(String name, int num) {
		this.name = name; // ¸â¹ö ÇÊµå <= ÀÎÀÚ
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
		
		System.out.println(Season3.º½);
		System.out.println(Season3.º½.name);
		System.out.println(Season3.º½.num);
		System.out.println(Season3.º½.ordinal());
		
		System.out.println("------------------");
		
		Season3 seasons[] = Season3.values(); 
		
		System.out.println(seasons[0].name);
		
	}
	
}