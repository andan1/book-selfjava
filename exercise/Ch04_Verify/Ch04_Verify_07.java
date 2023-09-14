package Ch04_Verify;

import java.util.Scanner;

public class Ch04_Verify_07 {

	public static void main(String[] args) {
		boolean run = true;
		int account = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------");
			System.out.print("선택 > ");
			
			int menuNum = Integer.parseInt(scanner.nextLine());
			
			switch (menuNum) {
			case 1:
				System.out.print("예금액 > ");
				account += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("출금액 > ");
				account -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("잔고 > ");
				System.out.println(account);
				break;
			case 4: 
				run = false;
				break;
			}
			
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
		scanner.close();
	}

}
