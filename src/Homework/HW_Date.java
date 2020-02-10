package Homework;

import Lab.Calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HW_Date {

    /**
     * Homework:
     * 1. Convert this date into string format "Fri, June 7 2013"
     * 2. Convert this date into string format "Friday, Jun 7, 2013 12:10:56 PM"
     *
     * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
     */

    public static void main(String[] args) throws ParseException {

            SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM dd, yyyy");
            Calender calender = new GregorianCalendar (Fri June 7 2013);
             System.out.println(sdf.format(calender));

//        String dateInString = "Fri, June 7 2013";
//        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM d yyyy"); /// I was trying in the other way
//        Date date = formatter.parse(dateInString);
//        System.out.println(date);

//             SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss aaa");
//            Calender calender = new GregorianCalendar(2013, );                // I was trying in the other way
//             System.out.println(sdf.format(calender));

            String stringDate = "Friday June 7, 2013 12:10:56 PM";
            SimpleDateFormat format = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss aaa");
            Date date = format.parse(stringDate);
             System.out.println(date);

    }
}
