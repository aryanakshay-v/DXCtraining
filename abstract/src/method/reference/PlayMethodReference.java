package method.reference;

public class PlayMethodReference {
	public static void main(String[] args) {
		/*
		 * Runnable r = () -> { for(int i=0;i<10;i++){
			System.out.println("Im in main thread"); } };
			
			Thread t = new Thread(r); t.start();
		 */
		Runnable r = PlayMethodReference::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("Im in main thread");
		}
	}
	
	public static void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("Im in m1 method");
		}
	}

}
