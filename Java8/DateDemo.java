package in.ashokit.Java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date d =new Date();
		System.out.println(d);
		
		//converting date to string 
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MMMM/yyyy");
		String format = sdf.format(d);
		System.out.println(format);
		
		SimpleDateFormat sdf1 =new SimpleDateFormat("MMMM/dd/yyyy");
		String format1 = sdf1.format(d);
		System.out.println(format1);
		
		//Converting  String to Date
		SimpleDateFormat sdf3 =new SimpleDateFormat("yyyy-MM-dd");
		Date parse = sdf3.parse("2023-06-04");
		System.out.println(parse);
		}

}
