package Ch03.sec02.exam10;
// 대입 연산자 (이항 연산자)
public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result = " + result);
		
		result -= 5;
		System.out.println("result = " + result);
		
		result *= 3;
		System.out.println("result = " + result);
		
		result /= 5;
		System.out.println("result = " + result);
		
		result %= 3;
		System.out.println("result = " + result);
	}

}
// 대입 연산자 : 오른쪽 피연산자의 값을 왼쪽 피연산자인 변수에 저장
// = : 오른족의 피연산자의 값을 왼쪽 변수에 저장
// += : 변수 = 변수 + 피연산자
// -= : 변수 = 변수 - 피연산자
// *= : 변수 = 변수 * 피연산자
// /= : 변수 = 변수 / 피연산자
// %= : 변수 = 변수 % 피연산자
// &= : 변수 = 변수 & 피연산자
// |= : 변수 = 변수 | 피연산자
// ^= : 변수 = 변수 ^ 피연산자