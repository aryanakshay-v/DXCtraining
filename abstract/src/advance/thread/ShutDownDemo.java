package advance.thread;

public class ShutDownDemo {
	public static void main(String[] args) {
		Runtime runtime=Runtime.getRuntime();
		runtime.addShutdownHook(new WatchMan());
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();

	}
		
	}

}
class WatchMan extends Thread{
	public void run() {
		System.out.println("The shutdown task is completed");
	}
	
}