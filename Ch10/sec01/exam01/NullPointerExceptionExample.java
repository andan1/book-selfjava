package Ch10.sec01.exam01;
// NullPointerException
public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());
	}

}
// 객체 참조가 없는 상태
// 객체가 없는 상태에서 객체를 사용하려 했으니 예외 발생