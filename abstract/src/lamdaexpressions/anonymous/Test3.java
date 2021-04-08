package lamdaexpressions.anonymous;

public class Test3 {
	public static void main(String[] args) {
		Interfacedemo interfacez = new Interfacedemo() {
			
			@Override
			public void m2() {
				System.out.println("m2-- interfacedemo");
			}
			
			@Override
			public void m1() {
				System.out.println("m1-- interfacedemo");
				
			}
		};
		
		interfacez.m1();
		interfacez.m2();
	}


}
