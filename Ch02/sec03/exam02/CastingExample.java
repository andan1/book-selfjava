package Ch02.sec03.exam02;
// 강제 타입 변환
public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
// 큰 허용 범위 타입을 작은 허용 타입으로 강제로 나눠서 저장하는 것