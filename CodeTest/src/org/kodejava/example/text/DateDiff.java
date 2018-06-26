package org.kodejava.example.text;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

/**
 * DateDiff -- compute the difference between two dates.
 */
public class DateDiff {
  public static void main(String[] av) {
    /** The date at the end of the last century */
	  
	  Calendar cal = new GregorianCalendar();
	  int Year = cal.get(Calendar.YEAR);
	  int Month = cal.get(Calendar.MONTH);
	  int Day= cal.get(Calendar.DAY_OF_MONTH);
	  int Hour = cal.get(Calendar.HOUR_OF_DAY);
	  int Minutes = cal.get(Calendar.MINUTE);
	  Calendar ca = new GregorianCalendar(Year, Month, Day, Hour, Minutes);
	  ca.add(Calendar.DAY_OF_MONTH, 1);
	  Date d1 = ca.getTime();
	  System.out.println(d1);
    
	  Calendar Startcal = new GregorianCalendar();
	  int StartYear = Startcal.get(Calendar.YEAR);
	  int StartMonth = Startcal.get(Calendar.MONTH);
	  int StartDay= Startcal.get(Calendar.DAY_OF_MONTH);
	  int StartHour = 22;
	  Calendar Startca = new GregorianCalendar(StartYear, 10, 4, 2, 00);
	  Date Startd1 = Startca.getTime();
	  System.out.println("Startd1 = "+Startd1);
	  
	  Calendar Endcal = new GregorianCalendar();
	  int EndYear = Endcal.get(Calendar.YEAR);
	  int EndMonth = Endcal.get(Calendar.MONTH);
	  int EndDay= Endcal.get(Calendar.DAY_OF_MONTH);
	  int EndHour = 22+3;
	  Calendar Endca = new GregorianCalendar(EndYear, 10, 4, 4, 00);
	  Date Endd1 = Endca.getTime();
	  System.out.println("Endd1 = "+Endd1);
	  
	  Calendar Currentcal = new GregorianCalendar();
	  int CurrentYear = Currentcal.get(Calendar.YEAR);
	  int CurrentMonth = Currentcal.get(Calendar.MONTH);
	  int CurrentDay= Currentcal.get(Calendar.DAY_OF_MONTH);
	  int CurrentHour = Currentcal.get(Calendar.HOUR_OF_DAY);
	  int CurrentMin = Currentcal.get(Calendar.MINUTE);
	  Calendar Currentca = new GregorianCalendar(CurrentYear, 10, 3, 23, 00);
	  Date Currentd1 = Currentca.getTime();
	  System.out.println(Currentd1);
	  

	  
	  /** Today's date */
    Date today = new Date();

    // Get msec from each, and subtract.
    long diff =   d1.getTime()-today.getTime();
    long StartDiff =   Startd1.getTime()-Currentd1.getTime();
    long EndDiff =   Endd1.getTime()-Currentd1.getTime();

    System.out.println("The 21st century (" + today + ") is "+ diff + " days old.");
    long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
    long startminutes = TimeUnit.MILLISECONDS.toMinutes(StartDiff);
    long Endminutes = TimeUnit.MILLISECONDS.toMinutes(EndDiff);
    System.out.println(minutes);
    System.out.println("startminutes = "+startminutes);
    System.out.println("Endminutes = "+Endminutes);
  }
}
