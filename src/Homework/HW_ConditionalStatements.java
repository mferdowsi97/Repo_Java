//package Homework;
//
//public class HW_ConditionalStatements {
//
//    public static void main(String[] args) {
//
////  1. Menu
////  boolean isGuestOneVegan = true;
////  boolean isGuesttwoVegan = true;
////  Are both vegan? only offer up vegan dishes.
////  At least one vegan? make sure offer up some vegan options.
////  Else, offer anything on the menu
//
//        boolean isGuestOneVegan = true;
//        boolean isGuestTwoVegan = true;
//
//        if (isGuestOneVegan = true && isGuestTwoVegan = true) {
//            System.out.println("Only offer vegan dishes");
//        } else if (isGuestOneVegan = true || isGuestTwoVegan = true) {
//            System.out.println("Offer only some vegan dishes");
//        } else {
//            System.out.println("Offer anything on the menu");
//        }
//
////____________________________________________________________________________________________________________
////2. Driver Controller
////* I want to be able to put car on P mode, D mode, N mode, R mode
////* If i am on P mode and parking type is parallel then i can park between two cars
////* If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
////* If i am on N mode i can put car in car wash station
////* If i am on R mode I can only reverse the car and car will activate back camera
////* If mode is incorrect then print me invalid mode type, please check your car mode

//    String gear = "d";
//    boolean isParallelParking = true;
//    String driveMode = "SPORT";
//
//        switch (gear.toUpperCase()) {
//             case "P":
//                 System.out.println("");
//                 if (isParallelParking) {
//                     System.out.println("parallel parking available");
//                } else {
//                     System.out.println("Not available");
//                 }
//            break;
//               case "D":
//                 System.out.println();
//                 switch (driveMode.toLowerCase()) {
//                     case "snow":
//                         System.out.println("YOu are driving in snow mode");
//                         break;
//                       case "sport":
//                           System.out.println("YOu are driving in sport mode");
//                         break;
//                        default:
//                             System.out.println("Wrong mode entered: " + driveMode);
//                }
//                break;
//                 case "N":
//                     System.out.println("Neutral mode");
//                 break;
//                 case "R":
//                    System.out.println("Back camera switches on");
//                  break;
//                default:
//                     System.out.println("Invalid gear entered: " + gear);
//        }​
////____________________________________________________________________________________________________________
////3. Store a number in an int variable.
////if the number is divisible by 15
////Display "Divisible by 15"
////Otherwise Display the remainder you get when divide number by 15
//
//        int num = 32;
//        int divisibleBy = 15;
//        int remainder = num % divisibleBy;
//        if(remainder == 0) {
//            System.out.println("Divisible by " + divisibleBy);
//        } else {
//            System.out.println("Remainder after dividing " + num + " by " + divisibleBy + ": " + remainder);
//        }
//
////_________________________________________________________________________________________
////4. Store your name in a variable.
////if your name length comes out greater than 8, Display your name after replacing all 'a' to 'A' from your name.
////Otherwise, Display your name in uppercase.
//
//                String myName = "Deepak";
//                int nameLength = myName.length();
//                if (nameLength > 8) {
//                System.out.println("Replacing all 'a' to 'A' from " + myName + ": " + myName.replaceAll("a", "A"));
//                } else {
//                System.out.println(myName + " in all uppercase: " + myName.toUpperCase());
//                }
//
////_______________________________________________________________________________________
////5. Create an array of 5 int values. Calculate the average of those 5 values. [pls don't use for-loop]
//// If you average of stored numbers greater than 25
//// Display Array from index 0 to last
//// Otherwise
//// Display Array from index last to 0
//
//                int[] numArray = {4, 21, 55, 7, 32};
//                int lenArray = numArray.length;
//                //Adding all numbers of array without using for-loops
//                double arrayTotal = numArray[lenArray-5]+numArray[lenArray-4]+numArray[lenArray-3]+numArray[lenArray-2]+numArray[lenArray-1];
//                //above code is same as -> double arrayTotal = numArray[0]+numArray[1]+numArray[2]+numArray[3]+numArray[4];
//                double avgArray = arrayTotal/lenArray;
//
//                if (avgArray > 25) {
//                System.out.println("Print from index 0 to last -> " +
//                numArray[lenArray-5] + ", " + numArray[lenArray-4] + ", " +
//                numArray[lenArray-3] + ", " + numArray[lenArray-2] + ", " +
//                numArray[lenArray-1]);
//                } else {
//                System.out.println("Print from index last to 0 -> " +
//                numArray[lenArray-1] + ", " + numArray[lenArray-2] + ", " +
//                numArray[lenArray-3] + ", " + numArray[lenArray-4] + ", " +
//                numArray[lenArray-5]);
//                }
//
////_______________________________________________________________________________________
////6. Create a supermarket item finder
////Take input from user and based on the input, you should display user which aisle has the item
////For example: user enter milk, you program should say aisle 8. If the item is not found,
////display a message saying "Out of stock "Please create program for below requirement
////        Milk = Aisle Eight
////        Eggs = Aisle Eight
////        French Fries = Aisle seven
////        Candy = Aisle Three
////        Frozen Pizza = Aisle seven
////        Donuts = Aisle Eight
////        Diapers = Aisle One
////        Apple = Aisle two
////        Orange = Aisle two
//
//        String item = "Donuts";
//
//        switch (item) {
//            case "Diapers";
//                System.out.println("Aisle One");
//                break;
//            case "Apple";
//            case "Orange";
//                System.out.println("Aisle Two");
//                break;
//            case "Candy";
//                System.out.println("Aisle Three");
//                break;
//            case "French Fries";
//            case "Frozen Pizza";
//                System.out.println("Aisle Seven");
//                break;
//            case "Donuts";
//            case "Eggs";
//            case "Milk";
//                System.out.println("Aisle Eight");
//                break;
//            default:
//                System.out.println("Out of Stock");
//        }
//
//
//
//
//        }
//    }