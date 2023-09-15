package Ch10.sec02.exam02;
// 예외 처리 떠넘기기
public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} 
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
// throws : 메소드를 호출한 곳으로 예외를 떠넘길 때
// 리턴타입 메소드이름(매개변수, ...) throws 예외클래스1, 예외클래스2, ... {}
// throws 키워드가 있는 메소드는 반드시 try 블록 내에서 호출되어야 함
