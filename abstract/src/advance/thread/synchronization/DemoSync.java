package advance.thread.synchronization;

public class DemoSync {
	public static void main(String[] args) {
		Table table = new Table();
				MyThread1 myThread1 = new MyThread1(table,"mt1");
				MyThread2 myThread2 = new MyThread2(table,"mt2");
				
				myThread1.start();
				myThread2.start();
				
	}

}
