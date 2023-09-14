package 연습문제;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 0;

        for (int count = 1; count <= 3; count++) {
            System.out.print(count + "번째 변수의 값을 입력하세요: ");
            int value = Integer.parseInt(scanner.nextLine());

            if (value > max) {
                max = value;
            }
        }

		System.out.println("최대값은 " + max + "입니다.");
		
		scanner.close();
	}

}
//3개의 정수값을 입력받아 가장 큰 수를 구하시오.