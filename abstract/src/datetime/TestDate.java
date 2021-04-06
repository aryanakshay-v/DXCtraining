package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestDate {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);

		ZoneId officZoneId = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(officZoneId);
		System.out.println("date and time in los angeles now is"+zdt);
		/*LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.of(1999, 10, 20);
		Period period = Period.between(dob,  today);
		LocalDate lastday = dob.plusYears(10);
		Period periodLeft = Period.between(today, lastday);
		System.out.printf("no of years = %d, no of months =%d,no of days = %d\n", period.getYears(),period.getMonths(),period.getDays());
		System.out.printf("no of years leftt = %d, no of months left =%d,no of days left = %d\n", periodLeft.getYears(),period.getMonths(),period.getDays());
		
		LocalDate localdate = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalTime localTime = LocalTime.now();
		int day= localdate.getDayOfMonth();
		System.out.println(day);
		System.out.println(localdate.getDayOfYear());
		System.out.println(localdate.plusDays(15));
		System.out.println(localDateTime);
		System.out.println(localTime.plusMinutes(5));*/
	}

}
