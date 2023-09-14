package Ch08.sec02.exam02;

import Ch08.sec02.exam03.Vehicle;

// 구현 클래스
public class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
