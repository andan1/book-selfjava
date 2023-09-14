package Ch08.sec01.exam06;

import Ch08.sec01.exam03.RemoteControl;
import Ch08.sec01.exam04.Television;
import Ch08.sec01.exam04.Audio;

// 인터페이스 사용
public class MyClass {
	// 필드
	RemoteControl rc = new Television();
	
	// 생성자
	MyClass() {
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
