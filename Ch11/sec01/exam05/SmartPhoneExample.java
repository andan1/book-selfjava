package Ch11.sec01.exam05;
// 객체의 문자 정보(toString() 메소드)
public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		// 재정의된 toString() 호출
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		// 재정의된 toString()을 호출하고 리턴값을 받아 출력
		System.out.println(myPhone);
	}

}
// 매개값으로 객체를 주면 객체의 toSpring() 메소드를 호출해서 리턴값을 받아 출력