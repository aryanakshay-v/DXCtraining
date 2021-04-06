package file.io;
import java.io.*;
public class FileOutputStreamExample {
	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("C:\\Users\\Aryan Akshay\\Desktop//demo.txt");
			fout.write(65);
			fout.close();
			System.out.println("success.....");
			
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
	}

}
