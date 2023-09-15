package Ch10.sec02.exam01;
// 일반 예외 처리
public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
// try-catch-finally 블록 : 
// 생성자 내부와 메소드 내부에서 작성되어 일반 예외와 실행 예외가 발생할 경우 예외 처리를 해줌
// try {예외 발생가능 코드} catch(예외클래스 e) {예외 처리} finally {항상실행;}
