package chap121;

public class WaitNotifyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WorkObject sharedObject = new WorkObject();
//		
//		ThreadA threadA = new ThreadA(sharedObject);
//		ThreadB threadB = new ThreadB(sharedObject);
//		
//		threadA.start();
//		threadB.start();
		
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		
		consumerThread.start();
		producerThread.start();
		
	}

}
