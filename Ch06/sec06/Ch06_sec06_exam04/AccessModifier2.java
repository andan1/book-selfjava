package Ch06_sec06_exam04;

public class AccessModifier2 {

}
// 객체를 생성하기 위해서는 new 연산자로 생성자를 호출
// 하지만 생성자를 어디에서나 호출할 수 있는 것은 아님
// 생성자가 어떤 접근 제한을 갖느냐에 따라 호출 가능 여부 결정
// public 접근 제한 : public ClassName(...) {...}
// 					모든 패키지에서 아무런 제한 없이 생성자를 호출
// protected 접근 제한 : protected ClassName(...) {...}
//					   default와 같지만 다른 패키지에 속한 클래스가 자식 클래스라면 호출 가능
// default 접근 제한 : default ClassName(...) {...}
//					 다른 패키지에서는 생성자를 호출할 수 없음
// private 접근 제한 : private ClassName(...) {...}
//					 오로지 클래스 내부에서만 생성자 호출 가능
// 싱글톤 패턴 : 여러 개의 객체를 만들지 못하도록 설계 