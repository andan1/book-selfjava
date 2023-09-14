package Ch02.sec02.exam01;
// 정수 리터럴 (정수 타입)
public class IntegerLiteralExample {

	public static void main(String[] args) {
		int var1 = 0b1011; 	// 이진수
		int var2 = 0206; 	// 8진수
		int var3 = 365;		// 10진수
		int var4 = 0xB3;	// 16진수
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
	}

}
// byte, short, char, int, long