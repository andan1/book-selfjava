package Ch08.sec02.exam02;
// 매개 변수의 다형성 테스트
public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 자동 타입 변환
		driver.drive(bus);
		driver.drive(taxi);
	}

}
