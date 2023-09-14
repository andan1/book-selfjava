package Ch02.sec01.exam04;
// 변수 사용 범위
public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10)  {
			int v2;
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5; 
	}

}
// v2 변수를 사용할 수 없기 때문에 에러
// 변수는 자신이 선언된블록 내부에서만 사용 가능