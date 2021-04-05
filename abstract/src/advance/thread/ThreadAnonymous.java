package advance.thread;

public class ThreadAnonymous {
	public static void main(String[] args) {
		Thread t1= new Thread(){
			
		public void run() {
			System.out.println ("The thread is running");
			};
		};
		t1.start();
		

	}
}
