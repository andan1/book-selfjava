package Ch05.sec02.exam01;
// 값 목록으로 배열 생성 (배열)
public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for (int i=0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / 3;
		
		System.out.println("평균 : " + avg);
	}
}
// 배열 : 같은 타입의 데이터를 연속된 공간에 나열하고 각 데이터에 인덱스를 부여해놓은 자료구조
//		 score[인덱스]
// 배열은 같은 타입의 데이터만 저장할 수 있다
// 한 번 생성된 배열은 길이를 늘리거나 줄일 수 없다
// 배열 선언 : 배열을 사용하기 위해서는 뱌열 선언을 해야 한다
//			 형식 1 : 타입[] 변수;
//			 형식 2 : 타입 변수 [];
// 배열 생성 : 배열 객체를 생성하려면 값 목록을 이용하거나 new 연산자 이용