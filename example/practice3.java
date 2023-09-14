package 연습문제;

import java.time.LocalDate;

public class practice3 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		int month = now.getMonthValue();
		String season;
		
        if (month >= 3 && month <= 5) {
            season = "봄";
        } else if (month >= 6 && month <= 8) {
            season = "여름";
        } else if (month >= 9 && month <= 11) {
            season = "가을";
        } else { 
            season = "겨울";
        }

        System.out.println(now + "은 " + season + "입니다.");
	}

}
/*
LocalDate now = LocalDate.now();
int month = now.getMonthValue();

String season = (month >= 3 && month <= 5) ? "봄" :
                (month >= 6 && month <= 8) ? "여름" :
                (month >= 9 && month <= 11) ? "가을" : "겨울";

System.out.println(now + "은 " + season + "입니다.");
*/