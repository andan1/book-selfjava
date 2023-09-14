package Ch03_Verify;

import java.util.Scanner;

public class Ch03_Verify_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String name = scanner.nextLine();
		
		System.out.print("패스워드 : ");
		String pass = scanner.nextLine();
		
		int password = Integer.parseInt(pass);
		
		if (name.equals("java")) {
			if (password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			} 
		} else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		}
		
		scanner.close();
	}

}
