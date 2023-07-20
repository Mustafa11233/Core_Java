package in.ashokit.Java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class NewDateDemo {

	public static void main(String[] args) {
		
		LocalDate of =LocalDate.of(2021, 1, 20);
		System.out.println(of);
		
		Date d =new Date();
		System.out.println(d);
		
		LocalDate date =LocalDate.now();
		System.out.println(date);
		
		LocalDate date2 = date.plusDays(2);
		System.out.println(date2);
		
		
		LocalDate months = date.plusMonths(4);
		System.out.println(months);
		
		LocalDate years = date.plusYears(6);
		System.out.println(years);
		
		boolean leapYear = LocalDate.parse("2023-12-22").isLeapYear();
		System.out.println(leapYear);
		
		boolean before = LocalDate.parse("2021-12-22").isBefore(LocalDate.parse("2022-12-22"));
		System.out.println(before);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		time = time.plusHours(2);
		System.out.println(time);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		
		Period p = Period.ofDays(5);
		System.out.println(p.getDays());
		
		Period between = Period.between(LocalDate.parse("1991-10-21"),LocalDate.now());
		System.out.println(between);
		
		Duration duration = Duration.between(LocalTime.parse("16:00"), LocalTime.now());
		System.out.println(duration);
		
	}

}
