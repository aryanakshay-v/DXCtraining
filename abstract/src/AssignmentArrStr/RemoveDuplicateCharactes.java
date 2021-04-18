package AssignmentArrStr;

public class RemoveDuplicateCharactes {
	public static void main(String[] args) {
		String input_string= "Akshay is from Universe";
		char arr[] = input_string.toCharArray();
		String result = "";
		for(char i :arr) {
			if(result.indexOf(i)==-1)
			{
				result+=i;
			}
		}
		System.out.println(result);
	}

}
