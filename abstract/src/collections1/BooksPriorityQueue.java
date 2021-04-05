package collections1;

import java.util.Queue;

import collections1.Book;
import collections1.BooksData;

public class BooksPriorityQueue {
	public static void main(String[] args) {
		Queue< Book> books = BooksData.getBookData();
		for(Book b:books) {
			System.out.println(b.id+" "+b.bookName+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
