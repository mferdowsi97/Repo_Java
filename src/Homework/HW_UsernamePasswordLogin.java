//package Homework;
//
//import java.util.Scanner;
//
//public class HW_UsernamePasswordLogin {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter your login");
//
//        String actualUsername = scan.nextLine();
//        String expectedUsername = "mferdowsi";
//
//        String actualPassword = scan.nextLine();
//        String expectedPassword = "technosoft";
//
//        for (int i = 0; i < 4; i++) {
//
//            int count = 4 - i;
//
//            if (!actualUsername.equals(expectedUsername) || !actualPassword.equals(expectedPassword)) {
//
//
//                System.out.println("Login information invalid. Please provide valid username and password");
//                System.out.println("The number of tries you have remaining is " + count);
//
//                actualUsername = scan.nextLine();
//                actualPassword = scan.nextLine();
//
//            } else if (count == 0) {
//                System.out.println("Your account will be locked for 15 minutes");
//            } else {
//                System.out.println("Welcome to the homepage");
//                break;
//            }
//        }
//    }
//}
