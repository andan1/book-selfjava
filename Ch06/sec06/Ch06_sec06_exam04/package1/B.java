package Ch06_sec06_exam04.package1;
//생성자의 접근 제한(2)
public class B {
	// 필드
	A a1 = new A(true); 	// o
	A a2 = new A(1);		// o
	A a3 = new A("문자열");	// x
}
