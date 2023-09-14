package Ch06_sec05_exam03;
// 정적 메소드 선언 시 주의할 점
public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
		
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}

}
// 주의할 점
// 객체가 없어도 실행된다는 특징 때문에 정적 메소드를 선언할 때는 
// 이들 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다
// 객체 자신의 참조인 this 키워드도 사용이 불가능
/*
인스턴스 필드와 메소드
int field1;
void method1() {...}

정적 필드와 메소드
static int field2;
static method2() {...}

정적 메소드
static void method3() {
	this.field1 = 10;	-> x
	this.method1();		-> x
	field2 = 10;		-> o
	method2();			-> o
}
*/