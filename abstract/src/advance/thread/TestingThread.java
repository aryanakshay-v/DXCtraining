package advance.thread;

public class TestingThread {
	public static void main(String[] args)
	{
		JoinDemoThread t1 = new JoinDemoThread();
		JoinDemoThread t2 = new JoinDemoThread();
		JoinDemoThread t3 = new JoinDemoThread();
		t1.start();
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		/*DownloadThread downloadthread = new DownloadThread();
		downloadthread.start();
		DbThread dbThread = new DbThread();
		Thread thread = new Thread(dbThread);
		thread.start();
		
		sleep sthread = new sleep();
		sthread.start();*/
		
	}

}
