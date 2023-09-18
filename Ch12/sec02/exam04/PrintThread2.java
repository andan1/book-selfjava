package Ch12.sec02.exam04;
// 무한 반복해서 출력하는 스레드
public class PrintThread2 extends Thread {
	public void run() {
		while (true) {
			System.out.println("실행 중");
			if (Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
}
}
// 일시 정지를 만들지 않고도 interrupt() 호출 여부를 아는 방법