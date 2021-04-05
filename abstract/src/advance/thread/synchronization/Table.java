package advance.thread.synchronization;

import advance.thread.sleep;

public class Table {
	synchronized void printTable(int n) {
		
	
			
		for(int i=1;i<6;i++)
		 try {
			System.out.println(i*n);
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
