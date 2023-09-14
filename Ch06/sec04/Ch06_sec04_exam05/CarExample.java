package Ch06_sec04_exam05;
// 클래스 외부에서 메소드 호출
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");
		
	}

}
