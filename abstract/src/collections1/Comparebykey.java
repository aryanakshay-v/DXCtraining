package collections1;
import java.util.*;

public class Comparebykey {
	
	public static void main(String args[]){  
		
		Map<Integer,String> map=new HashMap<Integer,String>();  
		
		map.put(100,"Amit");    
		map.put(101,"Vijay");    
		map.put(102,"Rahul");        
		map.entrySet()   
		.stream()  
		  
		.sorted(Map.Entry.comparingByKey())    /*reverse acc to key  
	      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
	      comapre by value .stored(Map.Entry.compareByValue())
	      .stored(Map.Entry.compareByValue(Comparator.reverseOrder()))*/
		
		.forEach(System.out::println);  
	}  


}
