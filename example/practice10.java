package 연습문제;

public class practice10 {

	public static void main(String[] args) {
		int[] dice = new int[] { 1, 2, 3, 4, 5, 6 };
		
		final int size = 6;
		int freq[] = new int[size];
		
		for (int i = 0; i < 10000; i++) {
			++freq[(int) (Math.random() * size)];
		}
		
		System.out.println("=====================");
		System.out.println("면  빈도");
		System.out.println("=====================");
				
		for (int i = 0; i < 6; i++) {
			System.out.println(dice[i] + "  " + freq[i]);
		}
	}

}
