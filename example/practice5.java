package 연습문제;

import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String[] names = new String[3];
		
	    int[][] grades = new int[3][3];

	    for (int i = 0; i < 3; i++) {
	         System.out.print("학생 " + ( i + 1) + " 이름: ");
	         names[i] = scanner.nextLine();

	         System.out.print(names[i] + "의 국어 성적: ");
	         grades[i][0] = Integer.parseInt(scanner.nextLine());
	         System.out.print(names[i] + "의 영어 성적: ");
	         grades[i][1] = Integer.parseInt(scanner.nextLine());
	         System.out.print(names[i] + "의 수학 성적: ");
	         grades[i][2] = Integer.parseInt(scanner.nextLine());

	         System.out.println();
	        }

	        for (int i = 0; i < 3; i++) {
	            int sum = grades[i][0] + grades[i][1] + grades[i][2];
	            double avg = (double) sum / 3;
	            	            	            
		    System.out.println(names[i] + "의 총점과 평균은 " + sum + ", " + avg);
		    System.out.println();
		    }
	          
	        	        
		scanner.close();
		
	}

}
