package 연습문제;

import java.util.Scanner;

public class practice501 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String[] names = new String[3];
		String[] subject = new String[3];
	    int[][] grades = new int[3][3];

	    for (int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 3; j++) {
	    		System.out.print("학생 " + ( i + 1) + " 이름: ");
		         names[i] = scanner.nextLine();
		         System.out.print("과목 : ");
		         subject[j] = scanner.nextLine();
		         System.out.print(names[i] + "의 " + subject[j] + "성적: ");
		         grades[i][j] = Integer.parseInt(scanner.nextLine());
		         
		        }
	         
	        }

	        for (int i = 0; i < 3; i++) {
	        		int sum = grades[i][0] + grades[i][1] + grades[i][2];
		            double avg = (double) sum / 3;
		            
		        	System.out.println(names[i] + "학생의 총점과 평균은 " + sum + ", " + avg);
		    }
	        
	        System.out.println();
	        
	        for (int i = 0; i < 3; i++) {
	        	int sum1 = grades[0][i] + grades[1][i] + grades[2][i];
	        	double avg1 = (double) sum1 / 3;
	        	
	        	System.out.println(subject[i] + "과목의 총점과 평균은 " + sum1 + ", " + avg1);
	        }
	        scanner.close();
	}

}
