package genrics;

public class TestOb {
	public static void main(String[] args) {
		Gen<String> g1 = new Gen<String>("aryan");
		g1.show();
		System.out.println(g1.getOb());
		
		Gen<Integer> g2 = new Gen<Integer>(new Integer(20));
		g2.show();
		System.out.println(g2.getOb());
		Test<Mynumber> mytest = new Test<Mynumber>(new Mynumber(), new Mynumber());
		
		
	}

}
