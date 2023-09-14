package Ch05.sec02.exam10;
// 향상된 for문
public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}

}
// 향상된 for문 : 배열이나 컬렉션을 좀 더 쉽게 처리하기 위해
//				루프 카운터 변수와 증감식을 사용하지 않는다
// 				저장할 변수 선언과 콜론 그리고 배열을 작성
