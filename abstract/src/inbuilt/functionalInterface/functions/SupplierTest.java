package inbuilt.functionalInterface.functions;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date();
		
		Supplier<String> otps = () -> {
			String otp = "";
			for(int i=1;i<=6;i++) {
				otp = otp +(int) (Math.random() * 10);
			}
			return otp;
		};
		//System.out.println(s.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		
		
	}

}
