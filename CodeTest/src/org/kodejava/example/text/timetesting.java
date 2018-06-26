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




public class timetesting {
	   public static void main(String[] args) {
		   Calendar cal = new GregorianCalendar();
		   //Current Date
			LocalDateTime today = LocalDateTime.now();
			System.out.println("Current DateTime="+today);
			/*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
			String formatDateTime = today.format(formatter);
			System.out.println("After : " + formatDateTime);*/
			
/*			LocalDateTime date = LocalDateTime.parse("2017-02-03T12:30:30");
		      System.out.println(date);  
		      LocalDateTime date1 = LocalDateTime.parse("2017-04-03T23:30:30");
		      System.out.println(date1);  
		      System.out.println(date1.compareTo(date));  */
		      
		      LocalDateTime ldt = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		      System.out.println("ldt =" + ldt);
		      ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault());
		      long millis = zdt.toInstant().toEpochMilli();
		      System.out.println("millis = " + millis);  
		
		      LocalDateTime edate =
		    		 LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault());
		      System.out.println("here " +edate);
		      System.out.println("here " + edate.toLocalTime());
		      System.out.println("here " + edate.getHour());
		      System.out.println("here " + edate.getMinute());
		      LocalDateTime newdate= edate.plusDays(1);
		      System.out.println("here day " + newdate );
		      int curTimeInMinutes = ((edate.getHour() * 60) + edate.getMinute());
		      int curTimeInMinutes2 = (cal.get(Calendar.HOUR_OF_DAY) * 60) + cal.get(Calendar.MINUTE);
		      System.out.println("curTimeInMinutes " + curTimeInMinutes );
		      System.out.println("curTimeInMinutes2 " + curTimeInMinutes2 );
		      
		        int starttime = 13;
		    	int NumHours = 2;
		    	int endtime = (starttime + NumHours);
		    	System.out.println("endtime " + endtime );
		      
		    	
		      /*		      ZonedDateTime date3 = ZonedDateTime.now();
		      System.out.println(date3);  

		      LocalDateTime date2 = LocalDateTime.parse("2017-02-03T12:30:30");
		      date3 = (ZonedDateTime)date2.adjustInto(date3);
		      System.out.println(date3);*/  
			
			//Current Date using LocalDate and LocalTime
			/*today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
			System.out.println("Current DateTime="+today);*/
			
			//Creating LocalDateTime by providing input arguments			
			LocalDateTime specificDate = LocalDateTime.of(LocalDate.now(), LocalTime.of(starttime, 30, 45));
			System.out.println("Specific Date="+specificDate);
			ZonedDateTime zone = specificDate.atZone(ZoneId.systemDefault());
		      long specmillis = zone.toInstant().toEpochMilli();
		      System.out.println(specmillis);
		      LocalDateTime e1date =
			    		 LocalDateTime.ofInstant(Instant.ofEpochMilli(specmillis), ZoneId.systemDefault());
			      System.out.println("here " +e1date);
			      
			      System.out.println("here " + e1date.toLocalTime());
			      System.out.println("here " + e1date.getHour());
			      System.out.println("here " + e1date.getMinute());
		      
			      LocalDate todaydate = LocalDate.now();
			      LocalTime todaytime = LocalTime.now();
			      LocalDate tomorrow = todaydate.plusDays(1);
				  
			  	System.out.println("Tomorrow's Date: "+tomorrow + todaytime );
			//Try creating date by providing invalid inputs
			//LocalDateTime feb29_2014 = LocalDateTime.of(2014, Month.FEBRUARY, 28, 25,1,1);
			//Exception in thread " main" java.time.DateTimeException: 
			//Invalid value for HourOfDay (valid values 0 - 23): 25

			
			//Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
			/*LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
			System.out.println("Current Date in IST="+todayKolkata);
*/
			//java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
			//LocalDateTime todayIST = LocalDateTime.now(ZoneId.of("IST"));
			
			//Getting date from the base date i.e 01/01/1970
			/*LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
			System.out.println("10000th second time from 01/01/1970= "+dateFromBase);
*/

	    }		
}