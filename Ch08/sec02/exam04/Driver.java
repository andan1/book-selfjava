package Ch08.sec02.exam04;

import Ch08.sec02.exam03.Vehicle;
import Ch08.sec02.exam03.Bus;

// 객체 타입 확인
public class Driver {
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {	// vehicle 매개 변수가 참조하는 객체가 bus인지 조사
			Bus bus = (Bus) vehicle;	// bus 객체일 경우 안전하게 강제 타입 변환
			bus.checkFare();			// bus 타입으로 강제 타입 변환을 하는 이유
		}
		vehicle.run();
	}
}
