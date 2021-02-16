package RentCar;

import java.util.Calendar;

public class Base {
	
	// 하위 클래스의 결과값을 출력하는 메소드
	public void displayData(String data) {
		System.out.println("조회한 데이터는" + data + "입니다/");
		
	}
	
	// 조회한 데이터의 시간 정보를 제공하는 메소드
	public String showTime() {
		
		String date = null;
		String time = null;
		
		Calendar cal = Calendar.getInstance(); // Calendar.getInstance() => Calendar 클래스의 인스턴스를 가져온다
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		
		date = year + "-" + month + "-" + day; // 년 월 일 연결
		time = hour + ":" + min + ":" + min; // 시 분 초 연결
		return date + " " + time; // 메소드 호출할 때마다 년월일,시분초 값 리턴된다

	}

}
