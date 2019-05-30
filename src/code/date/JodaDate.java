package code.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaDate {
	
public static Integer compareDates(String date) {
	SimpleDateFormat sf=new SimpleDateFormat("ddMMMyy");
	Date expiry = null;
	try {
		expiry = sf.parse(date);
	} catch (ParseException exceptionObject) {
		exceptionObject.printStackTrace();
	}
	Date current=new Date();
	String string=sf.format(current);
	try {
		current=sf.parse(string);
	} catch (ParseException exceptionObject) {
		exceptionObject.printStackTrace();
	}
	
	return current.compareTo(expiry);
	
}
	
	
	    public static void main(String[] sm) throws ParseException {
	    	System.out.println("Result" + JodaDate.compareDates("26jul18"));
	    	SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yy");
	    	
	    	Date d=sf.parse("26-jul-18");
	    	System.out.println("expiry"+d);
	    	Date d1=new Date();
	    	String string=sf.format(d1);
	    	System.out.println("sdf" + string);
	    	System.out.println("current" + d1);
	    	Date d00=sf.parse(string);
	    	System.out.println("parsed curent" + d00);
	    	System.out.println(d.compareTo(d00));
	 
	    	
	    }
	}
