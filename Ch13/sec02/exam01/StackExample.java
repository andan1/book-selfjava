package Ch13.sec02.exam01;

import java.util.*;

// Stack을 이용한 동전 케이스
public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		// 동전을 끼움
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// 동전 케이스가 비었는지 확인
		while (!coinBox.isEmpty()) {
			// 동전 케이스에서 제일 위의 동전을 꺼냄
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}

}
// Stack : LIFO 자료구조를 구현한 클래스, 후입선출
// push() : 주어진 객체를 스택에 넣는다
// peek() : 스택의 맨 위 객체를 가져온다, 객체를 스택에서 제거하지 않는다
// pop() : 스택의 맨 위 객체를 가져온다, 객체를 스택에서 제거한다