//package Classwork;
//
//import javax.swing.*;
//import java.util.Scanner;
//
//public class LoginValidation {
//
//    public static void main(String[] args) {
//
////  instance of scanner
//        Scanner scan = new Scanner(System.in);
//
////   Tell user to enter password
//        System.out.println("Please enter password");
//
////  Takes input from console and storing the value into actualPassword variable
//        String actualPassword = scan.nextLine();
//
////  Setting expected password which is associated with user account details in databases
//        String expectedPassword = "technosoft";
////  Creating for loop to give user max tries to enter valid password and log the user to system if correct password is used
//        for (int i = 0; i < 10; i++) {
////  Checking if actual password is not equal to entered password
//         if (!actualPassword.equals(expectedPassword)) {
////  Subtracting the count by iteration so user will have less tries (-1 every miss tries)
//          int count = 10 - i;
////  Console message to user to enter valid password
//          System.out.println("Please enter the valid password");
////  Console message to let user know how many more tries he has left with
//          System.out.println("You have " + count + " more tries");
////  Letting user to update the actualPassword value with new input from console
//             actualPassword = scan.nextLine();
////   If count equals to 9, then notifying user with custom message
//             if (i == 9) {
//                 System.out.println("Your account will be locked for 15 min");
//             }
//         } else {
////   If any point in the loops user enters correct password then system let user into home page
//             System.out.println("Welcome to home page");
//             break;
//         }
//        }
//    }
//    }