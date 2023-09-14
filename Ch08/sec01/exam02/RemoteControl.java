package Ch08.sec01.exam02;
// 상수 필드 선언
public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
}
// 상수 : public static final 타입 상수이름 = 값
// 인터페이스에 선언된 필드는 모두 상수의 특성을 가져서 생략 가능
// 상수는 선언과 동시에 초기값을 지정해야 함