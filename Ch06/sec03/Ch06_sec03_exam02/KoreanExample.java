package Ch06_sec03_exam02;
// 객체 생성 후 필드값 출력
public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "930525-0654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}

}
// 필드 초기화 : 필드를 선언할 때 초기값을 주는 방법, 생성자에서 초기값을 주는 방법
//			   일반적으로 필드와 동일한 이름을 갖는 매개 변수를 사용
//			   하지만 필드와 매개 변수 이름이 동일하면 생성자 내부에서 해당 필드에 접근할 수 없음
// this. : 객체 자신의 참조
