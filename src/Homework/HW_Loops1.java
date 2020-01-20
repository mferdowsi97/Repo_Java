//package Homework;
//
//public class HW_Loops1 {
//
//    public static void main(String[] args) {
//
//
//
//// 1.Students score, total possible score
////   15/20 -> You got a C (75%)
////   A 90-100, B 80-89, C 70-79, D 60-69, F 0-59
//
//
//        double score = 19;
//        int maxScore = 20;
//        double percentage = (score*100)/maxScore;
//
//        if (percentage >= 90) {
//            System.out.println("You got 'A' grade.");
//        } else if (percentage >= 80) {
//            System.out.println("You got 'B' grade.");
//        } else if (percentage >= 70) {
//            System.out.println("You got 'C' grade.");
//        } else if (percentage >= 60) {
//            System.out.println("You got 'D' grade.");
//        } else {
//            System.out.println("You got 'F' grade.");
//        }

////______________________________________________________________________________________________
////2. Write a logic that prints multiplication table of the user provided number upto ten.
//
//         Scanner input = new Scanner(System.in);
//        System.out.print("Enter number for which you want to generate multiplication table: ");
//        int mulTableNum = input.nextInt();
//        int tableUptoNum = 10;
//        System.out.println("Multiplication for " + mulTableNum);
//        for (int i=1 ; i <= tableUptoNum ; i++) {
//            System.out.println(mulTableNum + " * " + i + " = " + mulTableNum*i);
//        }
////______________________________________________________________________________________________
////3. Write a logic that checks if a number is a Prime number
//
//       System.out.print("Enter number to check if it's prime number or not: ");
//        int checkPrime = input.nextInt();
//        boolean isPrime = true;
//        if (checkPrime > 2) {
//            for (int i = 2; i < checkPrime; i++) { //for condition can also be, i < checkPrime
//                if (checkPrime % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime) {
//            System.out.println(checkPrime + " is a prime number");
//        } else {
//            System.out.println(checkPrime + " is NOT a prime number");
//        }
//
//
//
//
//
//
//
//
//
//
//    }
//}
