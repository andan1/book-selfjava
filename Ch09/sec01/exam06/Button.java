package Ch09.sec01.exam06;
// 중첩 인터페이스
public class Button {
	// 인터페이스 타입 필드
	OnClickListener listener;
	
	// 매개 변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// 구현 객체의 onClick() 메소드 호출
	void touch() {
		listener.onClick();
	}
	
	// 중첩 인터페이스
	static interface OnClickListener {
		void onClick();
	}
}
// 인스턴스 멤버 인터페이스와 정적 멤버 인터페이스 모두 중첩 가능
// 인스턴스 멤버 인터페이스는 바깥 클래스의 객체가 있어야 사용 가능
// 정적 멤버 인터페이스는 바깥 클래스 없이 바깥 클래스만으로 바로 접근 가능