package Ch09.sec02.exam04;
// 익명 객체의 로컬 변수 사용
public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		// arg1 = 20; -> x
		// arg2 = 20; -> x
		
		// var1 = 30; -> x
		// var2 = 30; -> x
		
		Calculator calc = new Calculator() {
		@Override
		public int sum() {
			int result = field + arg1 + arg2 + var1 + var2;
			return result;
		}
		};
		
		System.out.println(calc.sum());
	}
}
