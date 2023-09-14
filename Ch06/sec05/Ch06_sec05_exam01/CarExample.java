package Ch06_sec05_exam01;
// 인스턴스 멤버와 this
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
	}

}
