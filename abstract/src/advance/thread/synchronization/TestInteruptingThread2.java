package advance.thread.synchronization;

public class TestInteruptingThread2 extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("taskk");
		} catch (Exception e) {
			System.out.println("Exception handeled"+e);
			// TODO: handle exception
		}
		System.out.println("thread is running");
		}
	public static void main(String[] args) {
	TestInteruptingThread2 thread2 = new TestInteruptingThread2();
	thread2.start();
	
	thread2.interrupt();
	
	}
		
}

