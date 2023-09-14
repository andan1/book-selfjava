package Ch06_sec05_exam02;
// 정적 멤버 사용
public class Calculator {
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
// 정적 멤버 : 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드
// static : 정적 멤버 선언
// 정적 필드 : static 타입 필드 [초기값];
// 정적 메소드 : static 리턴 타입 메소드(매개변수선언, ...) {...}
// 정적 멤버 사용 : 클래스.필드;
//				 클래스.메소드(매개값, ...);
// 정적 요소는 클래스 이름으로 접근하는 것이 좋다