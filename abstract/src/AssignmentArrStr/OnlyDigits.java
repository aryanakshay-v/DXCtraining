package AssignmentArrStr;

public class OnlyDigits {
	public static void main(String[] args) {
		String str = "aa24";
		if(str.matches("[0-9]+")) {
			System.out.println("Only numbers");
		}
		else
		{
			System.out.println("Contains both digits and alpha");
		}
	}

}
