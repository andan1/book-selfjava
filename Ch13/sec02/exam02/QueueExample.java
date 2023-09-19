package Ch13.sec02.exam02;

import java.util.*;

// Queue를 이용한 메세지 큐
public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
				case "sendMail" :
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS" :
					System.out.println(message.to + "님에게 SMS을 보냅니다.");
					break;
				case "sendKakaotalk" :
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}
	}
}
// Queue : FIFO 자료구조에서 사용되는 메소드를 정의, 선입 선출
// 대표적인 클래스는 LinkedList
// offer() : 주어진 객체를 넣는다
// peek() : 객체 하나를 가져온다, 객체를 큐에서 제거하지 않는다
// poll() : 객체 하나를 가져온다, 객체를 큐에서 제거한다