package Ch02.sec04.exam01;
// printf() 메소드 사용 방법
public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value);
		System.out.printf("상품의 가격 : %6d원\n", value);
		System.out.printf("상품의 가격 : %-6d원\n", value);
		System.out.printf("상품의 가격 : %06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
/* 변수와 시스템 입출력
	println : 괄호 안의 내용을 출력하고 행을 바꿈
	print : 괄호 안의 내용을 출력만 함
	printf : 괄호 안의 첫 번째 문자열 형식대로 내용을 출력
		- printf("형식문자열", 값1, 값2)
	정수 : %d : 정수 -> 123
		  %6d : 6자리 정수, 왼쪽 빈 자리 공백 -> ___123
		  %-6d : 6자리 정수, 오른쪽 빈 자리 공백 -> 123___
		  %06d : 6자리 정수, 왼쪽 빈 자리 0 채움 -> 000123
	실수 : %10.2f : 소수점 이상 7자리, 소수점 이하 2자리, 왼쪽 빈 자리 공백 -> ____123.45
          %-10.2f : 소수점 이상 7자리, 소수점 이하 2자리, 오른쪽 빈 자리 공백 -> 123.45____
          %010.2f : 소수점 이상 7자리, 소수점 이하 2자리, 왼쪽 빈 자리 0채움 -> 0000123.45
	문자열 : %s : 문자열 -> abc
            %6s : 6자리 문자열, 왼쪽 빈 자리 공백 -> ___abc
			%-6s : 6자리 문자열, 오른쪽 빈 자리 공백 -> abc___
*/