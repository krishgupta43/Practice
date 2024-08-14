package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class Producer_Consumar_Main {
	public static void main(String[] args) {
		  Queue<Integer> buffer = new LinkedList<>();
	        int maxSize = 5;

	        Thread producerThread = new Thread(new Producer(buffer, maxSize));
	        Thread consumerThread = new Thread(new Consumer(buffer));

	        producerThread.start();
	        consumerThread.start();
	}

}
