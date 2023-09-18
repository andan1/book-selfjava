package Ch11.sec01.exam04;
// 객체의 문자 정보(toString() 메소드)
import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}

}
// toString : 객체의 문자 정보를 리턴