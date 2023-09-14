package Ch07_sec01.exam07.pack2;
//protected 접근 제한자
import Ch07_sec01.exam07.pack1.A;

public class C {
	public void method() {
		// 접근 불가능
		A a = new A();
		a.field = "value";
		a.method();
	}
}
