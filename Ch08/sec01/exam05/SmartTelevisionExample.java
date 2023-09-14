package Ch08.sec01.exam05;

import Ch08.sec01.exam03.RemoteControl;

// 인터페이스 변수에 구현 객체 대입
public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}

}
// 다중 인터페이스 구현 클래스 : 
//			인터페이스 A와 B가 객체의 메소드를 호출할 수 있으려면 객체는 모두 구현해야 함
