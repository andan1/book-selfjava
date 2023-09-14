package Ch06_sec04_exam02;
// 매개 변수의 개수를 모를 경우
public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2 : " + result2);
		
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4 : " + result4);
		
	}

}
// 매개 변수를 배열 타입으로 선언하면 메소드를 호출하기 전에 배열을 생성해야 함
// int sum1(int[] values)로 호출할 때
// -> int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});

// int sum2(int ... values)로 호출할 때
// -> int result4 = myCom.sum2(1, 2, 3, 4, 5);