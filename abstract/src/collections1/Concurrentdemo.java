package collections1;

import java.util.ArrayList;
import java.util.*;

public class Concurrentdemo extends Thread{
	static ArrayList<String> arrayList = new ArrayList<String> ();
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		arrayList.add("A");
		arrayList.add("Cacd");
		arrayList.add("bAcd");
		arrayList.add("dccd");
		
		Concurrentdemo concurrentDemo= new Concurrentdemo();
		concurrentDemo.start();
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			String s=iterator.next();
			System.out.println(s);
			Thread.sleep(6000);
		}
		System.out.println(arrayList);
	}

}
