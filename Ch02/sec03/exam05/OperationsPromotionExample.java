package Ch02.sec03.exam05;
// 연산식에서 자동 타입 변환 (실수 타입)
public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byteValue3 = byteValue1 + byteValue2 -> 컴파일 에러
		int intValue1 = byteValue1 + byteValue2;
		
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2 -> 컴파일 에러
		int intValue2 = charValue1 + charValue2;
		
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char) intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0 -> 컴파일 에러
		double doubleValue = intValue5 / 4.0;
		
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
	}

}
// float 타입에 저장할 시 실수 리터럴 뒤에 f나 F 붙일 것
/* int x = 1;
   int y = 2;
   double result = x / y;
   System.out.println(result);
   -> 0.5가 아닌 0.0 출력
*/ 
/* int x = 1;
   int y = 2;
   double result = (double) x / y;
   System.out.println(result);
   
   int x = 1;
   int y = 2;
   double result =  x / (double) y;
   System.out.println(result);
   
   int x = 1;
   int y = 2;
   double result = (double) x / (double) y;
   System.out.println(result);
   
   이렇게 세 가지로 표현 가능
*/