package code.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;


//https://www.baeldung.com/java-8-date-time-intro
public class Baeldubg_date_api {
	
	public static void main(String[] args) {
		new Baeldubg_date_api();
		LocalDate localDate = LocalDate.now();//The LocalDate represents a date in ISO format (yyyy-MM-dd) without time.
		System.out.println(localDate);
		LocalDate l1=LocalDate.of(1986, 03, 25);
		System.out.println(l1);
		LocalDate l2=LocalDate.parse("1986-03-25");
		System.out.println(l2);
		LocalDate l3=l2.plusDays(365);//code snippet gets the current local date and adds one day:
		System.out.println(l3);
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.WEEKS);
		System.out.println(previousMonthSameDay);
		
		boolean leapYear = LocalDate.now().plus(2, ChronoUnit.YEARS).isLeapYear();
		System.out.println("Leap year# " +  leapYear);
		LocalTime lt=LocalTime.now();
		LocalTime lt1=LocalTime.MAX;
		System.out.println(lt);
		System.out.println(lt1);
		//The relationship of a date to another can be determined to occur before or after another date:
		Boolean isBefore=LocalDate.of(2018, 10, 28).isBefore(LocalDate.of(2018, 10, 27));
		Boolean isAfter=LocalDate.of(2018, 10, 28).isBefore(LocalDate.of(2018, 10, 29));
		System.out.println(isBefore);
		System.out.println(isAfter);
		LocalDateTime beginningOfDay = LocalDate.parse("2016-06-10").atStartOfDay();
		System.out.println(beginningOfDay);
		LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
				  .with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(firstDayOfMonth);
		
		LocalTime t3=LocalTime.parse("12:55").plusHours(1).plusSeconds(25).plusNanos(2);
		System.out.println(t3); 
		
		int six = LocalTime.parse("06:30").getHour();
		System.out.println(six);
		
		boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
		System.out.println(isbefore);
		
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(allZoneIds);
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		System.out.println(zoneId.getRules());
		//The Period class represents a quantity of time in terms of years, months and days and the Duration class represents a quantity of time in terms of seconds and nano seconds.
		LocalDate initialDate = LocalDate.parse("2018-10-29");
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		System.out.println(finalDate);
		System.out.println(Period.between(initialDate, finalDate).getDays());
		
		LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST="+todayKolkata);
		
		LocalDateTime todayChicago = LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println("Current Chicago Date in IST="+todayChicago);
		
	}
	 
}
