package lamdaexpressions.collections;
import java.util.*;

public class ListNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(21);
		al.add(3);
		al.add(65);
		al.add(23);
		al.add(12);
		al.add(15);
		System.out.println(al);
		Comparator<Integer> c= (o1,o2)->(o1<o2)? -1 :(o1 > o2)? 1
						:0; 
		Collections.sort(al,c);
		System.out.println(al);
		/*al.sort(Comparator.naturalOrder());
		System.out.println("after sorting : "+al);*/
	}

}
