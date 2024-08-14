package Practice;

import java.util.Queue;
class Consumer implements Runnable {


	 private final Queue<Integer> buffer;

	    public Consumer(Queue<Integer> buffer) {
	        this.buffer = buffer;
	    }

	    @Override
	    public void run() {
	        try {
	            while(true) {
	                synchronized (buffer) {
	                    while (buffer.isEmpty()) {
	                        buffer.wait();
	                    }
	                    int item = buffer.poll(); 
	                    System.out.println("Consuming: " + item);
	                    buffer.notify(); 
	                }
	                Thread.sleep(1000);
	            }
	        } catch (Exception e) {
	           e.getMessage();
	        }
	    }
}
