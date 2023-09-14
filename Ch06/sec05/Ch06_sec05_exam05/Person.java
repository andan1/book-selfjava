package Ch06_sec05_exam05;
// final 필드 선언과 초기화
public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
// final 필드 : 최종적인 필드, 
//			   초기값이 저장되면 이것이 최종적인 값이 되어서 실행 도중에 수정할 수 없음
// 선언 : 필드 선언 시에 주는 방법
//		 생성자에서 주는 방법 