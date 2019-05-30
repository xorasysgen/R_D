package code.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringExample {

	public static void main(String[] args) {
		String string="``write2sirfsushil@gmail.com,sushil@apll.info,sushil_bhaskar@hotmail.com''";
		System.out.println(string.replaceAll("\\'", "").replaceAll("\\`", ""));
		SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
String date=d.format(new Date());
System.out.println(date.replaceAll("-", ""));
	}

}
