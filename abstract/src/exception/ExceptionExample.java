package exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nice movie");
		try {
			int a[]=new int[5];
			//a[5]=1/0;
			System.out.println(a[10]);
			System.out.println("Nice move");
			
		} 
		catch (ArithmeticException e) {
			System.out.println("This is Arthime");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This is array execption"+e.getMessage());
			// TODO: handle exception
		} 

		catch (Exception e) {
			System.out.println(e);
			
		}
	}

}