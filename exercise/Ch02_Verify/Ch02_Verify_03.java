package Ch02_Verify;

import java.util.Scanner;

public class Ch02_Verify_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.println("1. 이름: ");
		String strName = scanner.nextLine();
		
		System.out.println("2. 주민번호 앞 6자리: ");
		String strNum = scanner.nextLine();
		
		System.out.println("3. 전화번호: ");
		String strTel = scanner.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(strName);
		System.out.println(strNum);
		System.out.println(strTel);
		
		scanner.close();
	}

}
