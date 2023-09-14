package Ch06_sec06_exam05.package2;		// 패키지 다름 

import Ch06_sec06_exam05.package1.A;

//필드와 메소드의 접근 제한(3)
public class C {
	public C() {
		A a = new A();
		a.field1 = 1;	// o
		a.field2 = 1;	// x -> default 필드 접근 불가
		a.field3 = 1;	// x -> private 필드 접근 불가
		
		a.method1();	// o 
		a.method2();	// x -> default 메소드 접근 불가
		a.method3();	// x -> private 메소드 접근 불가
	}
}
