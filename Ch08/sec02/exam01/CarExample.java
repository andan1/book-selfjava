package Ch08.sec02.exam01;
// 필드 다형성 테스트
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}

}
// 인터페이스의 다형성 : 프로그램 소스 코드는 변함이 없는데 
//					 구현 객체를 교체함으로써 프로그램의 실행결과가 다양해지는 것
