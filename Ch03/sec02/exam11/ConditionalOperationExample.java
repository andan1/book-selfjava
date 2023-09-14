package Ch03.sec02.exam11;
// 삼항 연산자
public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
// 삼항 연산자 = 3개의 피연산자를 필요로 하는 연산자, 조건 연산식이라고도 함
// 			   ? 앞의 조건식에 따라 : 앞뒤의 피연산자가 선택
