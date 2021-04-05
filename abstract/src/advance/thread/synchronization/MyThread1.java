package advance.thread.synchronization;

public class MyThread1 extends Thread {
	Table table;

	public MyThread1(Table table, String string) {
		super();
		this.table = table;
	}
	@Override
	public void run()
	{
		table.printTable(5);
	}

}
