package Ch08.sec01.exam04;

import Ch08.sec01.exam03.RemoteControl;

// 구현 클래스
public class Audio implements RemoteControl {
	// 필드
	private int volume;
	
	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
		
	// turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	// setVolume() 추상 메소드의 실체 메소드
	// 인터페이스 상수를 이용해서 volume필드의 값을 제한
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
}