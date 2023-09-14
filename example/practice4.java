package 연습문제;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생 이름 : ");
		String name = scanner.nextLine();
		
		System.out.print("국어 성적 : ");
		int gradeKo = Integer.parseInt(scanner.nextLine());
		
		System.out.print("영어 성적 : ");
		int gradeEn = Integer.parseInt(scanner.nextLine());
		
		System.out.print("수학 성적 : ");
		int gradeMa = Integer.parseInt(scanner.nextLine());
		
		int sum = gradeKo + gradeEn + gradeMa;
		double avg = (double) sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		scanner.close();
	}

}
