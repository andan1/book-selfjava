package Ch06_sec03_exam03;
// 생성자의 오버로딩
public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 1
	Car() {
	}
	
	// 생성자 2
	Car(String model) {
		this.model = model;
	}
	
	// 생성자 3
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 생성자 4
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
// 생성자 오버로딩 : 다양한 방법으로 객체를 생성할 수 있도록 하는 것,
//				  매개 변수를 달리하는 생성자를 여러 개 선언하는 것