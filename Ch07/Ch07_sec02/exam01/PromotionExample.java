package Ch07_sec02.exam01;
// 자동 타입 변환

class A{}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 상속 관계에 있지 않기 때문에 컴파일 에러 발생
		// B b3 = e;
		// C c2 = d;
	}
}
// 다형성 구현 : 메소드 재정의 + 타입 변환
// 자동 타입 변환 : 프로그램 실행 도중에 자동적으로 타입 변환이 일어나는 것
// 클래스 변환은 상속 관계에 있는 클래스 사이에서 발생
// 변수는자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로만 한정
// 예외) 메소드가 자식 클래스에서 재정의되었다면 자식 클래스의 메소드가 대신 호출
