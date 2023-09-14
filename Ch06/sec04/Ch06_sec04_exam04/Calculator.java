package Ch06_sec04_exam04;
// 클래스 내부에서 메소드 호출
public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행 결과 : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
// 객체 내부에서 호출 : 메소드 (매개값, ...);
//
