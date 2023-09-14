package 연습문제;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] studentNames = new String[5];
		
		studentNames = new String[] { "홍길동", "홍이동", "홍삼동", "홍사동", "홍오동" };
		
		int[][] grades = new int[5][3];
		
		for (int i = 0; i < 5; i++) {
	        System.out.print(studentNames[i] + "의 국어 성적: ");
	        grades[i][0] = Integer.parseInt(scanner.nextLine());
	        
	    }
		
		int sum = 0;
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    String studentMax = "";

	    for (int i = 0; i < 5; i++) {
	        sum += grades[i][0];
	            
	        if (grades[i][0] > max) {
	        	max = grades[i][0];
				studentMax = studentNames[i];
			}
	            
			if (grades[i][0] < min) {
				min = grades[i][0];
			}
	    }

	    double avg = (double) sum / studentNames.length;

		System.out.println();
		System.out.println("국어 과목의 총점과 평균은 " + sum + ", " + avg);
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("가장 높은 국어점수를 기록한 학생 이름 : " + studentMax);
	    
 
		scanner.close();
		
		
	}

}
// 학생 5명의 성적을 관리하는 관리프로그램을 만들려고 한다
// 학생의 리스트를 대표변수를 이용하여 학생의 이름을 출력하세요
// 최고 점수를 구해라
// 최저 점수를 구해라
// 가장 높은 국어점수를 기록한 학생 이름을 구해라

// max = Math.max(max, grades[i][0]);
// min = Math.min(min, grades[i][0]);