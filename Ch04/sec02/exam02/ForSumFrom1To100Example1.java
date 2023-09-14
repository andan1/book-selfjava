package Ch04.sec02.exam02;
// 1부터 100까지 합을 출력 (for문) (반복문)
public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합 : " + sum);
	}

}
