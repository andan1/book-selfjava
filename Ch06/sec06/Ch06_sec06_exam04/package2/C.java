package Ch06_sec06_exam04.package2;

import Ch06_sec06_exam04.package1.A;

//생성자의 접근 제한(1)
public class C {
	// 필드
		A a1 = new A(true); 	// o
		A a2 = new A(1);		// x
		A a3 = new A("문자열");	// x
}
