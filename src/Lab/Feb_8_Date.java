//package Lab;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
//public class Feb_8_Date {
//
//    Date todayAgain = new Date();
//    System.out.println(todayAgain);
//    Calendar ourCal = Calendar.getInstance();
//
//    Date today = ourCal.getTime();
//    System.out.println(today);
//    ourCal.add(Calendar.DAY_OF_YEAR, 2);
//
//    Date futureDate = ourCal.getTime();
//    System.out.println();
//
//    //        ourCal.add(Calendar.DAY_OF_YEAR, -2);
////        System.out.println(ourCal.getTime());
//
//    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
//    String stringDate = sdf.format(futureDate);
//    System.out.println(stringDate);
//    String givenDate = "06-07-2020";
//    Date parsedDate = sdf.parse(givenDate);
//    System.out.println(parsedDate);
//}
