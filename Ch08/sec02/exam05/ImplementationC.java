package Ch08.sec02.exam05;
// 하위 인터페이스 구현
public class ImplementationC implements InterfaceC {
	// 실체 메소드도 있어야 함
	public void methodA() {
		System.out.println("Implementation-methodA() 실행");
	}
	
	// 실체 메소드도 있어야 함
	public void methodB() {
		System.out.println("Implementation-methodB() 실행");
	}
	
	public void methodC() {
		System.out.println("Implementation-methodC() 실행");
	}
}
