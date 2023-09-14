package Ch04.sec02.exam06;
// 1부터 10까지 출력 (while문) (반복문)
public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;
		
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

}
// while문 : 조건식이 true일 경우에 계속해서 반복
// do-while문 : 블록 내부의 실행문을 우선 실행하고 실행결과에 따라서 반복 실행을 계속 할지 결정할 때 사용
