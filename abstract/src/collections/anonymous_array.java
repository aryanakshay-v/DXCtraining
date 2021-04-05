package collections;

public class anonymous_array {
	public static void printarray(int arr[])
	{
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		printarray(new int[] {10,22,44,66});
	}

}
