package Test;


import java.util.HashSet;


public class January_23 {


    public static void main(String[] args) {

        int[] givenArray = {0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2};
        missingSmallestPositiveInteger(givenArray);

        //Did not finish question 2
        //I am having trouble calling question 3




    }

//    1.
//    Create a method to return missing smallest positive integer (greater than 0) from given array.
//    Example:
//    For array : [1,3,5,4,2,7]
//    Method should return : 6
//    For array : [-1, -3, 4, 2]
//    Method should return : 1
//    For array : [0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2]
//    Method should return : 6

    public static int missingSmallestPositiveInteger(int[] givenArray) {
        int s = 1;

        HashSet<Integer> x = new HashSet<Integer>();
        int n = givenArray.length;

        for (int i = 0; i < n; i++) {
            if (s < givenArray[i]) {
                x.add(givenArray[i]);
            } else if (s == givenArray[i]) {
                s = s + 1;

                while (x.contains(s)) {
                    x.remove(s);
                    s = s + 1;
                }

            }

        }

        return s;
    }

//2.
//    Write a Java program to remove a specific element from an array.
//    Original array: [32, 14, 24, 98, 24, 56, 148, 24, 78, 24]
//    New Array: [32, 14, 98, 56, 148, 78]

    public static int removeSpecificElementFromArray(int[] myArray, int removeSpecificElement) {

        int n = myArray.length;
        for (int i = 0; i <= n; i++)
            if (i == removeSpecificElement) {
                //how do I remove it??


                return []myArray;

            }


    }

//3.
////    Scenario: Traffic ticketing system
////   1. Speed Limit = 70
////   2. Every 5 miles over the speed limit will add 1 point
////   3. Use Math.floor(1.4)to round the speed to downward value
////   4. If user reaches 12 points then license is suspended
////    Example:
////    userspeed=78(70-75->1point)
////    userspeed=88(70-75->1point,75-80->1point,80-85->1point ; total 3 points)

    public String trafficTicketingSystem(int speedLimit, int userSpeed) {
        int speedOver = userSpeed - speedLimit;
        int licensePoints = Math.floorDiv(speedOver,5);
        String trafficMessage = " ";

        if (licensePoints > 1 && licensePoints < 12) {
            trafficMessage = "You have a total of " + licensePoints + " points.";
        } else if (licensePoints >= 12) {
            trafficMessage = "You have reached: " + licensePoints + " points. Your license will be suspended.";
        }
        return trafficMessage;
    }


//    public static int trafficTicketingSystem(int userSpeed) {
//
//        for (int i = 70; i >= 70; i = i + 5) {
//            if (userSpeed <= i) {
//                System.out.println("Good job; no points taken away");
//            } else if (userSpeed >= 70 && userSpeed < 75) {
//                System.out.println("1 point taken away");
//            } else if (userSpeed >= 76 && userSpeed < 80) {
//                System.out.println("2 point taken away");
//            } else if (userSpeed >= 81 && userSpeed < 85) {
//                System.out.println("3 point taken away");
//            } else if (userSpeed >= 86 && userSpeed < 90) {
//                System.out.println("4 point taken away");
//            } else if (userSpeed >= 91 && userSpeed < 95) {
//                System.out.println("5 point taken away");
//            } else if (userSpeed >= 96 && userSpeed < 100) {
//                System.out.println("6 point taken away");
//            } else if (userSpeed >= 101 && userSpeed < 105) {
//                System.out.println("7 point taken away");
//            } else if (userSpeed >= 106 && userSpeed < 110) {
//                System.out.println("8 point taken away");
//            } else if (userSpeed >= 111 && userSpeed < 115) {
//                System.out.println("9 point taken away");
//            } else if (userSpeed >= 116 && userSpeed < 120) {
//                System.out.println("10 point taken away");
//            } else if (userSpeed >= 121 && userSpeed < 125) {
//                System.out.println("11 point taken away");
//            } else if (userSpeed >= 126 && userSpeed <= 130) {
//                System.out.println("12 point taken away");
//            } else {
//                System.out.println("License Suspended");
//            }
//
//            return userSpeed;
        }















