package Ch07_sec03.exam01;
// 실행 클래스
public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
	
}
// 실체 클래스 : 객체를 직접 생성할 수 있는 클래스
// 추상 클래스 : 클래스들의 공통적인 특성을 추출해서 선언한 클래스
// 추상 클래스가 부모, 실체 클래스가 자식으로 구현
// 추상 클래스의 용도 : 공통된 필드와 메소드의 이름을 통일할 목적,
//					실체 클래스를 작성할 때 시간 절약
// 추상 클래스 선언 : 클래스 선언에 abstract를 붙여야 함
// new 연산자를 이용해서 객체를 못만들고 상속을 통해 자식 클래스만 만들 수 있음
