package org.kodejava.example.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class moduleTest {
	   public static void main(String[] args){
		   String dateStart = "2001-07-04T12:08:56.235-0700";
		   String dateStop = "2001-07-04T12:08:56.235-0700";
		   int StartTime = 23;
		   int endTime = 6;
		   // Custom date format
		   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");  

/*		   Date d1 = null;
		   Date d2 = null;
		   try {
		       d1 = format.parse(dateStart);
		       d2 = format.parse(dateStop);
		   } catch (ParseException e) {
		       e.printStackTrace();
		   }    

		   // Get msec from each, and subtract.
		   long diff = d2.getTime() - d1.getTime();
		   long diffSeconds = diff / 1000;         
		   long diffMinutes = diff / (60 * 1000);         
		   long diffHours = diff / (60 * 60 * 1000);                      
		   System.out.println("Time in seconds: " + diffSeconds + " seconds.");         
		   System.out.println("Time in minutes: " + diffMinutes + " minutes.");         
		   System.out.println("Time in hours: " + diffHours + " hours."); 
		   
		   

		   long seconds = TimeUnit.MILLISECONDS.toSeconds(diff);
		   long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
		   System.out.println(seconds + "   "+minutes/60);*/
		   
		   LocalDate todaydate = LocalDate.of(2018, 11, 03);
			//LocalDate newDate = todaydate.plusDays(1);
			LocalDateTime nextDayStartTime = LocalDateTime.of(todaydate,
					LocalTime.of(StartTime, 00, 00));
		   
		   LocalDate endate = LocalDate.of(2018, 11, 04);		
			LocalDateTime nextDayendTime = LocalDateTime.of(endate,
					LocalTime.of(endTime, 00, 00));
		   
		   

			//ZonedDateTime zdtNextDate = nextDayStartTime.atZone(ZoneId.systemDefault());
			String datecheck= nextDayStartTime.toString();
			String endtimestring = nextDayendTime.toString();
			
			Date dateNTime = null;
			Date endTimeString = null;
			
			try {
			dateNTime = format.parse(datecheck);
			endTimeString= format.parse(endtimestring);
			
			} catch (ParseException e) {
			       e.printStackTrace();
			   }    
			System.out.println(endTimeString);
			System.out.println(dateNTime);
			 long diff1 = endTimeString.getTime() - dateNTime.getTime();
			 long minutes1 = TimeUnit.MILLISECONDS.toMinutes(diff1);
			 long diffHours1 = diff1 / (60 * 60 * 1000);
			 System.out.println("Time in hours: " + diffHours1 + " hours."); 
			 System.out.println(minutes1);
			 
			
	   }	   
	   
	   private void stringchange(){
		   
		   
	   }
	   
}