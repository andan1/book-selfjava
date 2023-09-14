package SimpleFortuneGame;

import java.util.Date; // 패키지의 대문자단어는 이 패키지에는 Date클래스가 있음
					   //데이트 날짜 데이터 타입이 있음
import java.util.Random; 

import java.text.SimpleDateFormat;

public class SimpleFortuneGame {

	public static void main(String[] args) {
		// 오늘의 날짜를 얻어야 함
		// java.util.date 라이브러리 패키지에 있음
		// import java.util.Date 라는 라이브러리를 가져와야 함 
		// 오늘의 운세를 랜덤정수로 판별할 것
		// Random 라이브러리가 필요
		// java.util.Random 라이브러리 패키지 사용
		// 날짜는 각 나라마다 출력형식이 다름
		// 따라서 출력형식을 지정할 필요가 있음
		// 날짜 출력형식 지정 클래스는 java.text.SimpleDateFormat안에 있음
		
		// 만드는 방법
		// 1. 오늘 날짜를 얻는다 today = new Date();
		Date today = new Date();
		
		// 2. 날짜 객체는 현재 국가에 따라 다르게 표시가 된다
		//		따라서 이 부분을 한국형식으로 바꾸어 출력
		//		SimpleDateformat ("yyyy년 MM월 dd일")
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		// 3. 위의 오늘의 날짜를 어떻게 한국식으로 출력할 것인가
		// 위의 dateFormate 객체의 formate(날짜객체)를 실행하면
		// 지정한 형식의 현재 날짜 문자열을 반환
		System.out.println(dateFormat.format(today));
		
		// 4. 오늘의 운세를 얻어야 한다
		// 오늘의 운세는 단순하게 해서 난수를 0~100 사이의 숫자를 구해 이 숫자가 운세 백분율을 의미
		// 실제로는 운세 판단 공식이 필요
		// 랜덤객체를 만든다 new Random()
		Random rnd = new Random();
		
		// 5. 만들어진 랜덤객체로부터 지정한 범위까지의 정수를 얻는다
		// random.nextInt() % 100 : 임의의 수를 100으로 나눈 나머지를 구함 (0~99)
		// random 객체는 음수도 발생시킴 따라서 무조건 양수로 변환필요
		// Math.abs(변환숫자) : 변환숫자를 무조건 양수로 반환
		// rnd.nextInt() : 호출할 때마다 난수를 발생
		// 100으로 나눈 나머지의 양수에 +1을 해주면 100%행운표시 가능
		int randomNum = Math.abs(rnd.nextInt() % 100) + 1; // +1하면 100%도 가능
		
		// 6. 행운의 내용을 출력
		System.out.println("금전운(100%) : " + randomNum + "%");
		
	}

}
