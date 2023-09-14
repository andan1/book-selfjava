package Ch07_sec01.exam03;
// 자식 클래스
public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
