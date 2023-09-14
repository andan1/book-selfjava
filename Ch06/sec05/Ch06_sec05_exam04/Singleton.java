package Ch06_sec05_exam04;
// 싱글톤
public class Singleton {
	// 정적 필드
	private static Singleton singleton = new Singleton();
	
	// 생성자
	private Singleton() {}
	
	// 정적 메소드
	static Singleton getInstance() {
		return singleton;
	}
}
// 싱글톤 : 단 하나의 객체만 만들도록 보장해야 하는 경우, 이 객체를 싱글톤이라 함
// 싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 함
// 생성자 앞에 private 접근 제한자를 붙여야 함
// getInstance() : 외부에서 객체를 얻는 유일한 방법