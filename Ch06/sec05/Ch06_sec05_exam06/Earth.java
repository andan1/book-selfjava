package Ch06_sec05_exam06;
// 상수 선언
public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
}
// 상수 : 일반적으로 불변의 값, .static final 타입 상수 = 초기값;
// 상수는 static이면서 final
// static final 필드는 객체마다 존재하지 않고 클래스에만 존재
// 한번 초기값이 저장되면 변경할 수 없다
// 상수 이름은 모두 대문자로 작성
