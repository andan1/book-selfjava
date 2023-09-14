package Ch06_sec06_exam05.package1; 	// 패키지 동일
//필드와 메소드의 접근 제한(2)
public class B {
	public B() {
		A a = new A();
		a.field1 = 1;	// o
		a.field2 = 1;	// o
		a.field3 = 1;	// x
		
		a.method1();	// o
		a.method2();	// o
		a.method3();	// x
	}
}
