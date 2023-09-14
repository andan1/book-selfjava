package Ch03_Verify;

import java.util.Scanner;

public class Ch03_Verify_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 수 : ");
		String strnum1 = scanner.nextLine();
		
		System.out.println("두 번째 수 : ");
		String strnum2 = scanner.nextLine();
		
		System.out.println("----------------");
		
		
		float num1 = Float.parseFloat(strnum1);
		float num2 = Float.parseFloat(strnum2);
		float result = (float) num1 / num2;
		
		if (num2 == 0.0) {
			System.out.println("결과 : 무한대");
		} else {
			System.out.println("결과 : " + result);
		}
		
			
		scanner.close();
		
		
	}

}
