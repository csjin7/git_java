package chap121;

public class ConsumerThread extends Thread {
	private DataBox dataBox;

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = dataBox.getData();
		}
	}

	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	
}
