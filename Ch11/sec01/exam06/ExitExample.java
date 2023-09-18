package Ch11.sec01.exam06;
// exit() 메소드
public class ExitExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.exit(0);
				// break;
			}
		}
		System.out.println("마무리 코드");
	}

}
// exit() : 강제적으로 JVM을 종료
// 종료 상태값 : int 매개값을 지정