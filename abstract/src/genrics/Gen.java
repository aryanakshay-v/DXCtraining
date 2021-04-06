package genrics;

public class Gen<T> {
	T ob;
	public Gen(T ob) {
	this.ob = ob;}
	public void show() {
		System.out.println("The type of the class is");
	}
	public T getOb() {
		return ob;
	}
}
