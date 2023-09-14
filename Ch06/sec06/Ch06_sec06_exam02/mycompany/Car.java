package Ch06_sec06_exam02.mycompany;
// import문

import Ch06_sec06_exam02.hankook.*;
import Ch06_sec06_exam02.hyundai.Engine;
import Ch06_sec06_exam02.kumho.*;

public class Car {
	// 필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	Ch06_sec06_exam02.hankook.Tire tire3 = new Ch06_sec06_exam02.hankook.Tire();
	Ch06_sec06_exam02.kumho.Tire tire4 = new Ch06_sec06_exam02.kumho.Tire();
}
// import문 : 사용하고자 하는 클래스나 인터페이스가 다른 패키지에 소속되어 있을 때 사용
// 작성하는 방법 : import 상위패키지.하위패키지.클래스이름;
//				import 상위패키지.하위패키지.*;