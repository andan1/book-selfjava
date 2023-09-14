package Ch05.sec02.exam05;
// main() 메소드의 매개 변수
public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다");
			System.exit(0); // 프로그램 강제 종료
		}
		
		String strNum1 = args[0]; // 첫 번째 데이터 얻기 
		String strNum2 = args[1]; // 두 번째 데이터 얻기
		
		int num1 = Integer.parseInt(strNum1); // 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2); // 문자열을 정수로 변환
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result );
		
	}

}
// 명령 라인 입력 : main()메소드의 매개값인 String[] args
//	-> main()메소드는 String[] args 매개 변수를 통해서 명령 라인에서 입력된 데이터의 수와 입력된 데이터를 알수 있게 된다
