package code.java8;

/*Instant - It represents a timestamp
LocalDate - a date without time e.g. 2014-01-14. It can be used to store birthday, anniversary, date of joining etc.
LocalTime - represents time without a date
LocalDateTime - is used to combine date and time, but still without any offset or time-zone
ZonedDateTime - a complete date-time with time-zone and resolved offset from UTC/Greenwich
*/


import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

class x{

	public static void add() {
		System.out.println("x from parent");
	}
}

public class Java8DateTime   extends x {

	public static void add() {
		System.out.println("x from child");
	}
	
	public static int add(int a) {
		return a;
		
	}
	public static void main(String[] args) {
		new  Java8DateTime().add();
		Instant i=Instant.now();
		System.out.println("Current timestamp " + i);
		
/*		How to check for recurring events e.g. birthday in Java 8*/
		LocalDate dateFromBase = LocalDate.ofEpochDay(667);//667 birth day
		MonthDay md=MonthDay.of(dateFromBase.getMonthValue(), dateFromBase.getDayOfMonth());
		MonthDay today=MonthDay.from(LocalDate.now());
		if(today.equals(md)) {
			System.out.println("Happy Birth day");
		}
		else {
			System.out.println("Not your birth day today");
		}
		
		//https://javarevisited.blogspot.com/2015/03/20-examples-of-date-and-time-api-from-Java8.html
		YearMonth currentYearMonth = YearMonth.now();
		System.out.println(currentYearMonth.toString());
		YearMonth creditCardExpiry = YearMonth.of(2018, Month.FEBRUARY);
		System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
		//Output: Days in month year 2014-01: 31 Your credit card expires on 2018-02
		
		System.out.println("365th day from base date= "+dateFromBase);
		String s=dateFromBase.getYear() + "/"+ 	dateFromBase.getMonthValue() + "/"+ 	dateFromBase.getDayOfMonth();
		System.out.println(s);
		LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);//valid values 1 - 365/366)
		System.out.println("100th day of 2014="+hundredDay2014);
		
		LocalTime specificSecondTime = LocalTime.ofSecondOfDay(1000);
		System.out.println("1000th second time= "+specificSecondTime);
		
		LocalDate ld=LocalDate.parse("1972-01-01");
		if(ld.equals(dateFromBase)) {
			System.out.println("Both are same date");
		}
		else
		{
			System.out.println("Different date");
		}
		
		Duration thirtyDay = Duration.ofDays(1);
		System.out.println(thirtyDay.getSeconds());
		System.out.println(dateFromBase.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		
		Clock clock = Clock.systemUTC();
		System.out.println(clock.toString());
		System.out.println(clock.getZone().normalized());
		
		LocalDate formatted = LocalDate.parse("2018-11-01");
		System.out.println(formatted.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		System.out.println(formatted.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
	}

}
