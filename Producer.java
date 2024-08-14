package Practice;

import java.util.Queue;

public class Producer implements Runnable {
	private final Queue<Integer> buffer;
    private final int maxSize;

    public Producer(Queue<Integer> buffer, int maxSize) {
        this.buffer = buffer;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        try {
        	int i=1;
            while(true) {
                synchronized (buffer) {
                    while (buffer.size() >= maxSize) {
                        buffer.wait();
                    }
                    System.out.println("Producing: " + i);
                    buffer.offer(i); 
                    i++;
                    buffer.notify();
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
	}
