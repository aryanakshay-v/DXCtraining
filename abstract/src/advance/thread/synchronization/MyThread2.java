package advance.thread.synchronization;

public class MyThread2 extends Thread {
	Table table;

	public MyThread2(Table table, String string) {
		super();
		this.table = table;
	}
	@Override
	public void run() {
		table.printTable(100);
	}

}
