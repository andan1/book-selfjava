package Ch05.sec02.exam09;
// System.arraycopy()로 배열 복사
public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "Java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length );
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
// System.arraycopy(); :
//   -> System.arraycopy(원본 배열, 복사할 항목의 시작 인덱스, 새 배열, 새 배열에 붙여넣을 시작 인덱스, 복사할 개수);
