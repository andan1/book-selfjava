package Ch07_sec02.exam04;
// 실행 클래스 
public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
// 매개 변수의 타입이 클래스일 경우
// 해당 클래스의 객체뿐만 아니라 자식 객체까지도 매개값으로 사용할 수 있다는 것