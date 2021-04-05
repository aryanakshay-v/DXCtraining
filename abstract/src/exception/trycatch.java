package exception;

public class trycatch {
	public static void main(String[] args) {
		int i=60;
		int j=0;
		int data;
		try {
			data=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println(i/(j+2));
		}
		
	}

}
