package Ch07_sec01.exam07.pack2;
//protected 접근 제한자
import Ch07_sec01.exam07.pack1.A;

public class D extends A {
	public D() {
		// 접근 가능
		super();
		this.field = "value";
		this.method();
	}
}
