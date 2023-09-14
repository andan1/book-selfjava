package Ch03.sec02.exam06;
// 문자열 결합 연산자 (이항 연산자)
public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
	}

}
// 문자열 결합 연산자 : 문자열을 서로 결합하는 연산자 (+)
