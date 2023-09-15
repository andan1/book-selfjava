package Ch09.sec01.exam05;
// 중첩 클래스에서 바깥 클래스 참조 얻기
public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			// 중첩 객체 참조
			System.out.println(this.field);
			this.method();
			
			// 바깥 객체 참조
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
// 중첩 클래스에서 this 키워드를 사용하면 바깥 클래스의 객체 참조가 아닌
// 중첩 클래스의 객체 참조가 됨
// 바깥클래스.this.필드;
// 바깥클래스.this.메소드();