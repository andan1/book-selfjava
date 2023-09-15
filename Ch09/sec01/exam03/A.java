package Ch09.sec01.exam03;
// 멤버 클래스에서 사용 제한
public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			// 모든 필드와 메소드에 접근 가능
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			// field1 = 10;
			// method1();
			
			// 인스턴스 필드와 메소드는 접근 불가능
			field2 = 10;
			method2();
		}
	}
}
                                                               