package Ch11.sec02.exam01;

import java.text.*;
import java.util.*;

// 현재 날짜를 출력하기
public class DataExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		// 원하는 날짜 형식의 문자열
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// format() 메소드로 호출
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
// date 클래스 : 날짜를 표현하는 클래스