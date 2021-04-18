package StreamApi;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PeekDemo {


		public static void main(String[] args)
		{

			/*
			 * peek(): This method exists mainly to support debugging,
			 * where you want to see the elements as they flow past a
			 * certain point in a pipeline
			 */
			Stream.of("one", "two", "three", "four")
					.filter(e -> e.length() > 3)
					.peek(e -> System.out.println("Filtered value: " + e))
					.collect(Collectors.toList());

		}
	}
