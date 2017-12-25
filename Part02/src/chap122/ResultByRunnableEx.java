package chap122;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableEx {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("작업처리 요청");
		
		class Task implements Runnable {
			Result result;
			Task(Result result) {
				this.result = result;
			}
			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				result.addValue(sum);
			}
		}
		
		Result result1 = new Result();
		Result result2 = new Result();
		Runnable task1 = new Task(result1);
		Runnable task2 = new Task(result2);
		Future<Result> future1 = executorService.submit(task1, result1);
		Future<Result> future2 = executorService.submit(task2, result2);
	
		try {
			result1 = future1.get();
			result2 = future2.get();
			System.out.println("처리결과 : " + result1.accumValue);
			System.out.println("처리결과 : " + result2.accumValue);
			System.out.println("작업처리완료 ");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		
		executorService.shutdown();
	}

}

class Result {
	int accumValue;
	synchronized void addValue(int value) {
		accumValue += value;
	}
}
