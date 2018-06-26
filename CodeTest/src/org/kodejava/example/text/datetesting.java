package org.kodejava.example.text;

import java.util.Calendar;
import java.util.Date;


import java.text.DateFormat;
import java.text.SimpleDateFormat;




public class datetesting {
	   public static void main(String[] args) {
       Date now = new Date();
       int a = now.getDate();
       int b = now.getDay();
       int c = now.getHours();
       int d = now.getMinutes();
       int e = now.getMonth();
       int f = now.getSeconds();
       int g = now.getTimezoneOffset();
       long h = now.getTime();       

       
	    System.out.println("date = " + a);
	    System.out.println("Day = " +b);
	    System.out.println("Hour = "+c);
	    System.out.println("Min = " +d);
	    System.out.println("Month = " + e);
	    System.out.println("Sec = " + f);
	    System.out.println("Time zone off = " + g);
	    System.out.println("get Time = " + h);


	    }		
}