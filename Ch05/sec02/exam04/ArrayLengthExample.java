package Ch05.sec02.exam04;
// 배열의 length 필드 (배열)
public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
// 배열 길이 : 배열 변수.length;
// length 필드 : 읽기 전용 필드, 값을 바꿀 수가 없다