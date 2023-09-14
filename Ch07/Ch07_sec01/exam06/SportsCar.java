package Ch07_sec01.exam06;
//재정의할 수 없는 final 메소드
public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// 재정의할 수 없음
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
