package lamdaexpressions.anonymous;

public class test2 {
	public static void main(String[] args) {

		Person employee = new Person() {

			@Override
			void eat() {
				System.out.println("anonymous employee class is eating");
			}
		};
		employee.eat();



		Thread t = new Thread() { public void run() {
			System.out.println("child thread"); 
		} };
		t.start();


		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("i am in runnable");
			}
		};
		Thread t1 = new Thread(r);
		t1.start();

	}
}
