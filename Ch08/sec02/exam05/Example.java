package Ch08.sec02.exam05;
// 호출 가능 메소드
public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		// InterfaceA 변수는 methodA()만 호출 가능
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		// InterfaceB 변수는 methodB()만 호출 가능
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
// 인터페이스는 클래스와 달리 다중 상속을 허용
// 하위 인터페이스를 구현하는 클래스는 하위 인터페이스의 메소드뿐만 아니라
// 상위 인터페이스의 모든 추상 메소드에 대한 실체 메소드를 가지고 있어야 함