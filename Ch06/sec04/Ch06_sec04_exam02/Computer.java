package Ch06_sec04_exam02;
// 매개 변수의 개수를 모를 경우
public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i =0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
