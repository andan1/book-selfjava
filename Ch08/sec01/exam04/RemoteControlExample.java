package Ch08.sec01.exam04;

import Ch08.sec01.exam03.RemoteControl;

// 인터페이스 변수에 구현 객체 대입
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
	}

}
// 인터페이스 구현 : 구현객체, 구현 클래스
// 구현 객체 : 인터페이스에서 정의된 추상 메소드와 동일한 타입을 가진 실체 메소드를 가진 객체
// 구현 클래스 : 구현 객체를 생성하는 클래스
// 구현 클래스 선언 : implements 키워드 추가하여 인터페이스 이름을 명시
