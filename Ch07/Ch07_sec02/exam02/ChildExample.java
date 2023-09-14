package Ch07_sec02.exam02;
//자동 타입 변환 후의 멤버 접근
public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // -> 자동 변환 타입
		parent.method1();
		parent.method2(); // 재정의된 메소드 호출
		// parent.method3(); -> 호출 불가능
	}

}
