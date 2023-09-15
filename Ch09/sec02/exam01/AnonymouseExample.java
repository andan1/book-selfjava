package Ch09.sec02.exam01;
// 익명 자식 객체 생성
public class AnonymouseExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 익명 객체 필드 사용
		anony.field.wake();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체 매개값 사용
		anony.method2(
				// 매개값으로 익명 객체 대입
				new Person() {
				void study() {
					System.out.println("공부합니다.");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
				}
	   );
	}
}
// 익명 객체 : 이름이 없는 개체
// 조건 : 어떤 클래스를 상속하거나 인터페이스를 구현해야만 함