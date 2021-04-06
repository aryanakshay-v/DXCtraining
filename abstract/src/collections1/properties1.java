package collections1;
import java.io.*;
import java.util.Properties;

public class properties1 {
	public static void main(String[] args) {
		Properties p=null;
		try {
			FileReader reader= new FileReader("C:\\Users\\Aryan Akshay\\git\\niitdxctraining\\abstract\\bin\\collections1\\db.properties");
			p=new Properties();
			p.load(reader);
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}

}
