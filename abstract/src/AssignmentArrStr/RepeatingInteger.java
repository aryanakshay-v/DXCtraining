package AssignmentArrStr;

public class RepeatingInteger {
	void printrep(int arr[], int size) {
		  int i, j;
	        System.out.println("Repeated int are :");
	        for (i = 0; i < size; i++)
	        {
	            for (j = i + 1; j < size; j++)
	            {
	                if (arr[i] == arr[j])
	                    System.out.print(arr[i] + " ");
	            }
	        }
	}
	 public static void main(String[] args)
	    {
		 RepeatingInteger  rep = new RepeatingInteger ();
	        int arr[] = {4, 2, 4, 5, 5, 2, 3, 1};
	        int arr_size = arr.length;
	        rep.printrep(arr, arr_size);
	    }
	

}
