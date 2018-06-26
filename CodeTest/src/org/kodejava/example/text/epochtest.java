package org.kodejava.example.text;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.ZonedDateTime;




public class epochtest {
	   public static void main(String[] args) {
		  
		   LocalDateTime ldtCurrent = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		      System.out.println("ldt =" + ldtCurrent);
		      ZonedDateTime zdtCurrent = ldtCurrent.atZone(ZoneId.systemDefault());
		      long currentTime = (zdtCurrent.toInstant().toEpochMilli()/1000)/60;
		      System.out.println("currentTime = " + currentTime);
		   
		   
		      int starttime = 23;
		    	int NumHours = 8;
		    	int endtime = (starttime + NumHours)%24;
		    	System.out.println("endtime " + endtime );
		    	
		    	
		    	
		    	LocalDate todaydate = LocalDate.now();
			      LocalDate newDate = todaydate.plusDays(1);
			      LocalDateTime nextDayStartTime = LocalDateTime.of(newDate, LocalTime.of(starttime, 00, 00));
					ZonedDateTime zdtNextDate = nextDayStartTime.atZone(ZoneId.systemDefault());
					long nextDayInMinutes = (zdtNextDate.toInstant().toEpochMilli() / 1000) / 60;
					long endDelay = (nextDayInMinutes - currentTime);
			        System.out.println("start delay = " + endDelay);
			        System.out.println("new date  = " + newDate);
		    	
		    	
		    	
		    	/*LocalDateTime startTime = LocalDateTime.of(LocalDate.now(), LocalTime.of(starttime, 00, 00));
				System.out.println("Specific Date="+startTime);
				ZonedDateTime startTimeZone = startTime.atZone(ZoneId.systemDefault());
			      long startTimeEpoch = (startTimeZone.toInstant().toEpochMilli()/1000)/60;
			      System.out.println("startTimeEpoch = " + startTimeEpoch);
			      System.out.println("currentTime - startTimeEpoch = " + (startTimeEpoch-currentTime));
		   
			      
			      LocalDateTime endTime = LocalDateTime.of(LocalDate.now(), LocalTime.of(endtime, 00, 00));
					System.out.println("Specific Date="+endTime);
					ZonedDateTime endTimeZone = endTime.atZone(ZoneId.systemDefault());
				      long endTimeEpoch = (endTimeZone.toInstant().toEpochMilli()/1000)/60;
				      System.out.println("endTimeEpoch = " + endTimeEpoch);
				      System.out.println("currentTime - endTimeEpoch = " + (endTimeEpoch-currentTime));
		   
		   
		   
		   LocalDateTime ldt = LocalDateTime.of(2018, Month.NOVEMBER, 4, 2, 00, 00);
		      System.out.println("ldt =" + ldt);
		      ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault());
		      long millis = zdt.toInstant().toEpochMilli()/1000;		      
		      System.out.println("millis = " + millis);  
		     
		      LocalDate todaydate = LocalDate.now();
		      LocalDate newDate = todaydate.plusDays(1);
		      LocalDateTime nextDayStartTime = LocalDateTime.of(newDate, LocalTime.of(starttime, 00, 00));
				ZonedDateTime zdtNextDate = nextDayStartTime.atZone(ZoneId.systemDefault());
				long nextDayInMinutes = (zdtNextDate.toInstant().toEpochMilli() / 1000) / 60;
				long startDelay = (nextDayInMinutes - currentTime);
		        System.out.println("start delay = " + startDelay);
		        System.out.println("new date  = " + newDate);
		      LocalDateTime specificDate = LocalDateTime.of(2018, Month.NOVEMBER, 4, 1, 00, 00);
		      //LocalDateTime specificDate = LocalDateTime.of(LocalDate.now(), LocalTime.of(13, 00, 00));
				System.out.println("Specific Date="+specificDate);
				ZonedDateTime zone = specificDate.atZone(ZoneId.systemDefault());
			      long specmillis = zone.toInstant().toEpochMilli()/1000;
			      System.out.println(specmillis);			      
			      
			      long epochdiff = (millis - specmillis);
			      System.out.println(epochdiff);
			      long epochhours= (epochdiff/3600);
			      System.out.println(epochhours);*/
	    }		
}