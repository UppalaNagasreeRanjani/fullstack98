package com.Day14;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

public class DateTimeJava8 {
	public static void main(String[] args)throws UnsupportedTemporalTypeException {
		//LocalDate date=LocalDate.now();//for present system date
		//LocalTime date=LocalTime.now();//present local time in system
		//LocalDateTime date=LocalDateTime.now();//combination of time and date
		//ZonedDateTime date=ZonedDateTime.now();//omplete date-time with time-zone and resolved offset from UTC/Greenwich
		
//		LocalDate date=LocalDate.now();
//		int day= date.getDayOfMonth();
//		int month=date.getMonthValue();
//		int year=date.getYear();
//		
//		System.out.printf("year %d:,month %d:,day %d",year,month,day);//here we are getting year date month
	//for birthday
//		LocalDate bday=LocalDate.of(1997,11,30);
//		System.out.println("bday is      "+bday);
		
		//checking two dates are equal in java
//		LocalDate todaydate=LocalDate.now();
//		
//		LocalDate bday=LocalDate.of(1997,11,30);
//		if(bday.equals(todaydate))
//				{
//			System.out.printf("both are same%d year,%d month,%d day");
//			
//		}
//		else {
//			System.out.println("both are not same");
//		}
//		LocalDate todaydate=LocalDate.now();//for if ur bday or festival is there 
//		LocalDate bday=LocalDate.of(1997,11,30);
//		MonthDay mday=MonthDay.of(bday.getMonthValue(), bday.getDayOfMonth());
//		MonthDay present=MonthDay.now();
//		if(mday.equals(present)) {
//			System.out.println("today is birthday");
//		}
//		else {
//			System.out.println("not matched");
//		}
//		
//		LocalDate current=LocalDate.now();//for current date
//		
//		System.out.println(current);
//		LocalTime current=LocalTime.now();//adding hours to present date ,years,months
//		System.out.println(current);
//		LocalTime status=current.plusHours(2);
//		System.out.println(status);
		LocalDate date=LocalDate.now();
		LocalDate nextday1=date.plus(8,ChronoUnit.WEEKS);
		System.out.println(nextday1);
		LocalDate nextday2=date.plus(9,ChronoUnit.DAYS);
		System.out.println(nextday2);
		LocalDate nextday3=date.plus(1,ChronoUnit.CENTURIES);
		System.out.println(nextday3);
		LocalDate nextday4=date.plus(7,ChronoUnit. YEARS);
		System.out.println(nextday4);
		LocalDate nextday5=nextday4.minus(7,ChronoUnit. YEARS);//to get the previos days,months 
		System.out.println(nextday5);
		LocalDateTime t=LocalDateTime.now();
		LocalDateTime t1=t.plus(7,ChronoUnit. DAYS.HOURS);
		System.out.println(t1);
		Clock clock=Clock.systemUTC();
		System.out.println("Clock :"+clock);//Sytemclock
		Clock defaultClock=Clock.systemDefaultZone();//returns the asia/clcutta
		System.out.println("Clock :"+defaultClock);
LocalDate today=LocalDate.now();
		
		LocalDate tommorow=LocalDate.of(2015, 8, 20);
		if(today.isBefore(tommorow))
		{
			System.out.println("TRUE");
		}
		if(today.isAfter(tommorow))
		{
			System.out.println("flase");
		}
ZoneId zoneId=ZoneId.of("Asia/Calcutta");
		
		LocalDateTime localDateTime=LocalDateTime.now();
		ZonedDateTime zonedDateTime=ZonedDateTime.of(localDateTime, zoneId);
		System.out.println("Date and Time in delhi :"+zonedDateTime);
YearMonth y=YearMonth.now();//to get expiry date
		
		System.out.printf("The current %s : %d \t %n",today,today.getMonthValue());
		
		YearMonth creditExpiry=YearMonth.of(2020, Month.DECEMBER);
		System.out.println("Your Creadit Card Expiry is :"+creditExpiry);
LocalDate dat=LocalDate.now();//to check leap year or not
		
		if(dat.isLeapYear())
		{
			System.out.printf("The Year %s is a Leap Year %n",dat);
		}
		else
		{
			System.out.printf("The Year %s is not a Leap year %n",dat);
		}
LocalDate myMarriage=LocalDate.of(2016, Month.FEBRUARY, 03);//to get gap
		
		LocalDate n=LocalDate.now();
		
		Period months=Period.between(myMarriage, today);
		System.out.println("Months between My Marriage and today :"+months.getMonths());
		Instant instant=Instant.now();
		System.out.println("The Current timestamp is :"+instant);
String d="20160819";
		
		LocalDate formatted=LocalDate.parse(d, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.printf("The format of %s is %s \t%n",date,formatted);
		String birthday="Jan 10 1985";
		try
		{
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
			LocalDate birth=LocalDate.parse(birthday, formatter);
			System.out.printf("The Date %s is formatted in %s %n",birthday,birth);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		LocalDate arrival=LocalDate.now();
		try
		{
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
			String comming=arrival.format(formatter);
			System.out.printf("The Date %s is formatted in %s %n",arrival,comming);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}




