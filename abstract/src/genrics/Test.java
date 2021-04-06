package genrics;

public class Test<T extends Number & Runnable> {
	T a,b;
	
	public Test(T a, T b) {
		this.a=a;
		this.b=b;
	}
	public void arthmeticOperator() {
		System.out.println();
	}

}
