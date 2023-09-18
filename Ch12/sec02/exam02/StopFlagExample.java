package Ch12.sec02.exam02;
// 1초 후 출력 스레드를 중지
public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try { Thread.sleep(1000); 
		} catch (InterruptedException e) {}
		
		// 스레드를 종료하기 위해 stop필드를 true로 변경
		printThread.setStop(true);
	}

}
// 스레드의 안전한 종료
// stop플래그를 이용해서 run() 메소드의 종료를 유도