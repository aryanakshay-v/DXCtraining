package advance.thread;

public class JoinDemoThread extends Thread{
	@Override
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				System.out.println(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
