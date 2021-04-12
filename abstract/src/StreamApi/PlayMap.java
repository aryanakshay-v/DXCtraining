package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayMap {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(15);
		marks.add(12);
		marks.add(16);
		marks.add(13);
		marks.add(11);
		marks.add(14);
		marks.add(19);
		System.out.println(marks);
		
		List<Integer> updatedmarks = marks.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println(updatedmarks);
		List<Integer> evennumbers = marks.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		System.out.println(evennumbers);
		Long  noStudents =marks.stream().filter(i ->i<15).count();
		System.out.println(noStudents+" have scored less than 15");
		List<Integer> sort=marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
	}

}
