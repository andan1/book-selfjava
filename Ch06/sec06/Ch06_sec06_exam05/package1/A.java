package Ch06_sec06_exam05.package1;
// 필드와 메소드의 접근 제한(1)
public class A {
	// 필드
	public int field1;		// public 접근 제한
	int field2;				// default 접근 제한
	private int field3;		// private 접근 제한
	
	// 생성자
	public A() {
		field1 = 1;		// o
		field2 = 1;		// o
		field2 = 1;		// o
		
		method1();		// o
		method2();		// o
		method3();		// o
	}
	
	// 메소드 
	public void method1() {}	// public 접근 제한
	void method2() {}			// default 접근 제한
	private void method3() {}	// private 접근 제한
}
