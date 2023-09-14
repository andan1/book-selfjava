package 연습문제;

import java.util.Scanner;

public class practice502 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String[] names = new String[3];
        String[] subjects = new String[3];
        int[][] grades = new int[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생 " + (i + 1) + " 이름: ");
            names[i] = scanner.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("과목: ");
                subjects[j] = scanner.nextLine();
                System.out.print(names[i] + "의 " + subjects[j] + " 성적: ");
                grades[i][j] = Integer.parseInt(scanner.nextLine());
            }

            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            int sumStu = 0;
            
            for (int j = 0; j < 3; j++) {
                sumStu += grades[i][j];
            }
            
	    double avgStu = (double) sumStu / names.length;
	    
	    System.out.println(names[i] + " 학생의 총점과 평균은 " + sumStu + ", " + avgStu);
	}

	System.out.println();

	for (int i = 0; i < 3; i++){
		int sumSub = 0;

		for(int j = 0; j < 3; j++){
			sumSub += grades[j][i];
		}
		
		double avgSub = (double) sumSub / subjects.length;
		
		System.out.println(subjects[i]+" 과목의 총점과 평균은 "+sumSub+", "+avgSub);
	    }
	    
	scanner.close();
	}

}
