package Ch07_sec02.exam05;
// 강제 타입 변환
public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();	// 자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		불가능
		parent.field2 = "data2";
		parent.method3();
		*/
		
		Child child = (Child) parent;	// 강제 타입 변환
		child.field2 = "yyy";
		child.method3();
	}

}
// 강제 타입 변환 : 부모 타입을 자식 타입으로 변환하는 것
// 자식 타입이 부모 타입으로 자동 타입 변환한 후 다시 자식 타입으로 변환할 때
// 자식 타입 변수 = (자식타입) 부모타입;