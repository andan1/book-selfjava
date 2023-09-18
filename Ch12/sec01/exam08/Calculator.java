package Ch12.sec01.exam08;
// 동기화 메소드로 수정된 공유 객체
public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
// 임계 영역 : 멀티 스레드 프로그램에서 단 하나의 스레드만 실행할 수 있는 코드 영역
// 동기화 메소드 : 자바는 임계 영역을 지정하기 위해 동기화 메소드 제공
// 		 public synchronized void method() {임게 영역;} (단 하나의 스레드만 실행)
// 스레드가 동기화 메소드를 실행하는 즉시 객체에는 잠금이 일어나고
// 스레드가 동기화 메소드를 실행 종료하면 잠금이 풀림