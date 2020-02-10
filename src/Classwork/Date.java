//package Classwork;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//
//public class Date {
//
//    //        //Default current date

////        Date date = new Date();
////       // System.out.println(date);
////
////        //Format date

////        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
////        String formattedDate = sdf.format(date);
////        System.out.println(formattedDate);
////        String dateInString = "07-20-19";
////        SimpleDateFormat formattter = new SimpleDateFormat("MM-dd-yy");
////        Date date = formattter.parse(dateInString);
////        System.out.println(date);
//
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
//    Calendar calendar = new GregorianCalendar(2019,0,31);
//        System.out.println(sdf.format(calendar.getTime()));

//    int year       = calendar.get(Calendar.YEAR);
//    int month      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
//    int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
//    int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
//    int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
//    int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);
//    int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
//    int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
//    int minute     = calendar.get(Calendar.MINUTE);
//    int second     = calendar.get(Calendar.SECOND);
//    int millisecond= calendar.get(Calendar.MILLISECOND);
////
////        System.out.println(sdf.format(calendar.getTime()));
////
//        System.out.println("year \t\t: " + year);
//        System.out.println("month \t\t: " + month);
//        System.out.println("dayOfMonth \t: " + dayOfMonth);
//        System.out.println("dayOfWeek \t: " + dayOfWeek);
//        System.out.println("weekOfYear \t: " + weekOfYear);
//        System.out.println("weekOfMonth \t: " + weekOfMonth);
//        System.out.println("hour \t\t: " + hour);
//        System.out.println("hourOfDay \t: " + hourOfDay);
//        System.out.println("minute \t\t: " + minute);
//        System.out.println("second \t\t: " + second);
//        System.out.println("millisecond \t: " + millisecond);
//}
