package Ch06_sec04_exam01;
// 메소드 선언
public class Calculator {
	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
// 메소드 시그니처 : 메소드 선언부
// 리턴 타입 : 메소드가 리턴하는 결과의 타입을 표시
// 메소드 이름 : 메소드의 기능이 드러나도록 식별자 규칙에 맞게 이름을 지어줌
// 매개 변수 선언 : 메소드를 실행할 때 필요한 데이터를 받기 위한 변수를 선언
// 메소드 실행 블록 : 실행할 코드를 작성
// 메소드 선언 : 선언부(리턴타입, 메소드 이름, 매개 변수 선언)와 실행 블록으로 구성
// 리턴 값 : 메소드를 실행한 후의 결과 값 
