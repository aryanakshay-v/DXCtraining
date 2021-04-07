package datetime;


import java.time.temporal.Temporal;
import java.time.*;

public class TestDate {
	public static void main(String[] args) {
		ZoneOffset zone =ZoneOffset.UTC;
		Temporal temp =zone.adjustInto(ZonedDateTime.now());
		System.out.println(zone.getTotalSeconds());
		
	}

}
