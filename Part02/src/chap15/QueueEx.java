package chap15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "강가딘"));
		messageQueue.offer(new Message("sendSMS","윤똘띠"));
		messageQueue.offer(new Message("sendkakaotalk","망나니"));
		
		int i = 0;
		while(!messageQueue.isEmpty() ) {
			Message message = messageQueue.poll();
			//Message message = messageQueue.peek();
			System.out.println(message.command + " " + message.to);
			i++;
			if(i > 5) break;
		}

	}

}
