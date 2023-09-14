package Ch03.sec02.exam09;
// 논리 연산자 (이항 연산자)
public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자군요");
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자군요");
		}
		
		if((charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		
		if((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
	}

}
// 논리 연산자 : 논리곱(&&), 논리합(||), 배타적 논리합(^), 논리 부정(!) 연산을 수행
//			   boolean 타입만 사용 가능
// 논리곱 (&&,&) : 피연산자 모두가 true일 경우에만 연산 결과가 true, AND
// 논리합 (||, |) : 피연산자 중 하나만 true이면 연산 결과는 true, OR
// 배타적 논리합 (^) : 피연산자가 하나는 true이고 다른 하나가 false일 경우에만 연산 결과가 true, XOR
// 논리 부정 (!) : 피연산자의 논리값을 바꿈, NOT
// &&와 &의 차이 : &&는 앞의 피연산자가 false라면 뒤의 피연산자는 평가하지 않고 바로 false
//				 &는 두 피연산자 모두를 평가해서 산출 결과를 냄
//				 &&가 &보다 효율적

