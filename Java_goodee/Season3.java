package com.javateam.jse;

public enum Season3 {
	
	// SPRING, SUMMER, FALL, WINTER; 
	// SPRING("��", 1), SUMMER("����", 2), FALL("����", 3), WINTER("�ܿ�", 4);
	��("spring", 1), ����("summer", 2), ����("fall", 3), �ܿ�("winter", 4);
	
	private String name;
	private int num;
	
	Season3(String name, int num) {
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
		
		// Season season = Season.SPRING;
		// System.out.println(season);
		
		// System.out.println(Season.SPRING);
		// System.out.println(Season.valueOf("SPRING"));
		
		System.out.println(Season3.��);
		System.out.println(Season3.��.name);
		System.out.println(Season3.��.num);
		System.out.println(Season3.��.ordinal());
		
		System.out.println("------------------");
		
		Season3 seasons[] = Season3.values(); 
		
		System.out.println(seasons[0].name);
		
	}
	
}