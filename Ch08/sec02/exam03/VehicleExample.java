package Ch08.sec02.exam03;
// 강제 타입 변환
public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); -> Vehicle 인터페이스에는 checkFare()가 없음
		
		// 강제 타입 변환
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
