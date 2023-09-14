package Ch05.sec03.exam02;
// 열거 타입과 열거 상수

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null; // 열거 타입 변수 선언
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1)~토(7)까지의 숫자를 리턴
		
		switch(week) {
			case 1 :
				today = Week.SUNDAY; 
				break;
			case 2 : 
				today = Week.MONDAY;
				break;
			case 3 : 
				today = Week.TUESDAY;
				break;
			case 4 : 
				today = Week.WEDNESDAY;
				break;
			case 5 : 
				today = Week.THURSDAY;
				break;
			case 6 : 
				today = Week.FRIDAY;
				break;
			case 7 : 
				today = Week.SATURDAY;
				break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}

}

enum Week {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
// 열거 타입 변수 = 열거 타입. 열거 상수;
// null값 저장 가능
/*
int year = now.get(Calendar.YEAR);
int month = now.get(Calendar.MONTH) + 1;
int day = now.get(Calendar.DAY_OF_MONTH);
int week = now.get(Calendar.DAY_OF_WEEK);
int hour = now.get(Calendar.HOUR);
int minute = now.get(Calendar.MINUTE);
int second = now.get(Calendar.SECOND);
*/
