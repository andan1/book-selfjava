package Ch04.sec02.exam07;
// 1부터 100까지 합을 출력 (while문) (반복문)
public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1 ~ " + (i-1) + " 합 : " + sum);
	}

}
