package Ch12.sec02.exam05;
// 메인 스레드가 실행하는 코드
public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		System.out.println("메인 스레드 종료");
	}

}
// 데몬 스레드 : 스레드의 작업을 돋는 보조적인 역할을 수행하는 스레드
// 주 스레드가 종료되면 데몬 스레드는 강제적으로 자동 종료
// 주 스레드의 보조 역할을 수행하므로 주 스레드가 종료되면 데몬 스레드의 존재 의미가 사라짐
// Start() 메소드 호출전에 setDaemon(true)를 호출해야 함