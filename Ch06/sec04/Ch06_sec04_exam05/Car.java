package Ch06_sec04_exam05;
// 클래스 외부에서 메소드 호출
public class Car {
	// 필드
	int speed;
	
	// 생성자
	
	// 메소드
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			speed = i;
			System.out.println("달립니다. (시속 : " + speed + "km/h)");
		}
	}
}
// 객체 외부에서 호출 : 클래스 참조변수 = new 클래스(매개값, ...);
// 리턴값이 있으면 리턴값을 받을 변수에 저장해야 함