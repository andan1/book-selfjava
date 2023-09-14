package Ch03.sec02.exam02;
// 증감 연산자 (단항 연산자)
public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		x++;
		++x;
		System.out.println("x = " + x);
		
		System.out.println("---------------");
		y++;
		++y;
		System.out.println("y = " + y);
		
		System.out.println("---------------");
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("---------------");
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("---------------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
// 증감 연산자 : 변수의 값을 1증가(++)시키거나 1 감소(--)시키는 연산자,
//			   boolean 타입을 제외한 모든 기본 타입의 피연산자에 사용 가능
// ++ 피연산자 : 다른 연산을 수행하기 전에 피연산자 값을 1 증가시킴
// -- 피연산자 : 다른 연산을 수행하기 전에 피연산자 값을 1 감소시킴
// 피연산자 ++  : 다른 연산을 수행한 후에 피연산자 값을 1 증가시킴
// 피연산자 --  : 다른 연산을 수행한 후에 피연산자 값을 1 감소시킴



