package Ch06_sec04_exam06;
// 메소드 오버로딩
public class Calculator {
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
// 메소드 오버로딩 : 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것