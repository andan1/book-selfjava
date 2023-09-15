package Ch09.sec02.exam02;
// 익명 구현 객체 생성
public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 익명 객체 필드 사용
		anony.field.turnOn();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체 매개값 사용
		anony.method2(
			// 매개값
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("SmartTV를 켭니다.");
				}
				@Override
				public void turnOff() {
					System.out.println("SmartTV를 끕니다.");
				}
			}
		);
	}

}
// 구현 클래스를 명시적으로 선언하는 이유
// 어디서건 이미 선언된 구현 클래스로 간단히 객체를 생성해서 사용할 수 있기 때문에
// 재사용성이 높다
// 익명 구현 객체 : 구현 클래스가 재사용되지 않고 특정 위치에서 사용할 경우