package Ch11.sec01.exam08;

// Class 객체 정보 얻기
public class ClassExample {

	public static void main(String[] args) throws Exception {
		// 첫 번째 방법
		Class clazz = Car.class;
		
		// 두 번째 방법
		// Class clazz = Class.forName("sec01.exam.Car");
		
		// 세 번째 방법
		// Car car = new Car();
		// Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}
}
// Class 객체 얻기
// 클래스로부터 얻는 방법, 객체 없이 클래스 이름만 가지고 Class 객체를 얻는 방법
// 1. Class clazz = 클래스이름.class
// 2. Class clazz = Class.forName("패기키...클래스이름")
// 객체로부터 얻는 방법, 클래스로부터 객체가 이미 생성되어 있을 경우에 사용하는 방법
// 3. Class clazz = 참조변수.getClass();