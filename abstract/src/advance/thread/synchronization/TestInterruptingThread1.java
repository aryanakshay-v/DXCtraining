package advance.thread.synchronization;

public class TestInterruptingThread1 extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Thread interupted"+ e);
		}
	}
	
	public static void main(String[] args) {
		TestInterruptingThread1 thread1=new TestInterruptingThread1();
		thread1.start();
		try {
			thread1.interrupt();
		} catch (Exception e) {
			System.out.println("Exception handeld"+e);
			// TODO: handle exception
		}
	}

}
