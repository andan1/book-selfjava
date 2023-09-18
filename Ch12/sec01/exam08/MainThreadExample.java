package Ch12.sec01.exam08;
// 메인 스레드가 실행하는 코드
public class MainThreadExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		// User1 스레드 생성
		User1 user1 = new User1();
		// 공유 객체 설정
		user1.setCalculator(calculator);
		user1.start();
		
		// User1 스레드 생성
		User2 user2 = new User2();
		// 공유 객체 설정
		user2.setCalculator(calculator);
		user2.start();
	}

}
// 동기화 메소드 : 멀티 스레드 프로그램에서 스레드들이 객체를 공유해서 작업할 때