package 연습문제;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("암호는 : ");
		int num = Integer.parseInt(scanner.nextLine());
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번 째 시도 : ");
			int value = Integer.parseInt(scanner.nextLine());
			
			if (value == num) {
				System.out.println("암호 OK!");
				break;
			} else if (i < 5) {
				System.out.println("암호가 틀립니다! 올바른 암호를 입력해주세요");
			} else {
				System.out.println("암호를 확인해주세요");
				break;
			}
			}
		scanner.close();
		}
		
		
	}


// 암호 비교 