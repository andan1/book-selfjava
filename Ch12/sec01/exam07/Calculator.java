package Ch12.sec01.exam07;
// 공유 객체
public class Calculator {
	private int memory;
	public int getMemory() {
		return memory;
	}
	
	// 계산기 메모리에 값을 저장하는 메소드
	public void setMemory(int memory) {
		// 매개값을 memory 필드에 저장
		this.memory = memory;
		// 스레드를 2초간 일시정지 시킴
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
