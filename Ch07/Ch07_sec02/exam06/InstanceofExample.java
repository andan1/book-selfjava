package Ch07_sec02.exam06;
// 객체 타입 확인
public class InstanceofExample {

	public static void method1(Parent parent) {
		// Child 타입으로 변환이 가능한지 확인
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	public static void main(String[] args) {
		// Child 객체를 매개값으로 전달
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		// Parent 객체를 매개값으로 전달
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);	// 예외 발생
	}
}
// 강제 타입 변환은 자식 ㅏ입이 부모 타입으로 변환되어 있는 상태에서만 가능
// instanceof연산자 : boolean result = 좌항(객체) instanceof 우항(타입)
// 부모 변수가 참조하는 객체가 부모 객체인지 자식 객체인지 확인하는 방법
// 주로 매개값의 타입을 조사할 때 사용
// 타입을 확인하지 않고 강제 타입 변환을 시도한다면 ClassCastException이 발생할 수도 있음
