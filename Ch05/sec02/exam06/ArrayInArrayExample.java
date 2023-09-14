package Ch05.sec02.exam06;
// 배열 속의 배열 (다차원 배열)
public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"] = " + mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"] = " + englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };
		for (int i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"] = " + javaScores[i][k]);
			}
		}
	}

}
// 2차원 배열 : 가로 인덱스와 세로 인덱스 사용
// int[][] scores = new int[2][3]; -> 행2 열3
// scores.length -> 2, scores[0].length -> 3, scores[1].length -> 3
// int[][] scores = new int[2][];
// scores[0] = new int[2]; -> 2 (0, 1)
// scores[1] = new int[3]; -> 3 (0, 1, 2)