package Ch06_sec05_exam01;
// 인스턴스 멤버와 this
public class Car {
	// 필드
	String model;
	int speed;
	
	// 생성자
	Car(String model) {
		this.model = model;
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
		}
	}
}
// 인스턴스 멤버 : 객체마다 가지고 있는 멤버
// 정적 멤버 : 클래스에 위치시키고 객체들이 공유하는 멤버
// this : 주로 생성자와 메소드의 매개 변수 이름이 필드와 동일한 경우,
//		  인스턴스 멤버인 필드임을 명시하고자 할 때 사용