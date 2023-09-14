package Ch05.sec02.exam03;
// new 연산자로 배열 생성 (배열)
public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		arr1[0]	= 10;
		arr1[1]	= 20;
		arr1[2]	= 30;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for( int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		arr2[0]	= 0.1;
		arr2[1]	= 0.2;
		arr2[2]	= 0.3;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
		arr3[0]	= "1월";
		arr3[1]	= "2월";
		arr3[2]	= "3월";
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}

}
// new 연산자로 배열 생성 : new 연산자로 배열을 처음 생성할 경우 배열은 자동적으로 기본값으로 초기화
//						String 배열일 경우 모두 null값으로 초기화
/* 
기본 타입 (정수) : byte : 0, char : '\u0000', short : 0, int : 0, long : 0L
기본 타입 (실수) : float : 0.0F, double : 0.0
기본 타입 (논리) : boolean : false
참조타입 : 클래스 : null, 인터페이스 : null
 */