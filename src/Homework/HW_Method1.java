//package Homework;
//
//import java.util.Arrays;
//
//public class HW_Method1 {
//
//public static void main(String[] args) {
//
//        getReversedString("Happy"); //1
////_____________________________________________________________________
//        double[] myArray = {30, 10, 90, 40};
//        getReversedArray(myArray); //2
 ////_____________________________________________________________________
//        double[] arrayForSum = {2,4,6,8,10};
//        addNumbersinArray(arrayForSum);//3
// ////_____________________________________________________________________
//        double[] arrayToSort = {40,20,30,10};
//        sortArrayInAscendingOrder(arrayToSort);//4
/////_____________________________________________________________________ /
////      double[] arrayForDesending ={40,20,30,10};
////      sortDesendingOrder(arrayForDesending);
/////_____________________________________________________________________ /
//        double[] arrayForAverage = {20,40,60,80,100};
//        findAverage(arrayForAverage);//5
////_____________________________________________________________________ /
//        double[] arrayForMaximum = {20, 10, 40, 44, 32};
//        findMaximum(arrayForMaximum);//6
////_____________________________________________________________________ /
//        double[] arrayForMinimum = {20, 10, 40, 44, 32};
//        findMinimum(arrayForMinimum);//7
 ////_____________________________________________________________________ //
//        String wordForAbbreviation = "Happy New Year";
//        findAbbreviation(wordForAbbreviation);//8
////_____________________________________________________________________ /
//        int startNumber=2;
//        int length=5;
//        findFibonacciSeries(startNumber,length);//9
///_____________________________________________________________________ /
//        double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
//        String [] sNames = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky", "Hannah" , "David", "Gia"};
//        findStudentWithHighestScore(sMarks, sNames);//10
////_____________________________________________________________________ //
//        int sumUpTo = 5;
//        findSumUpTo(sumUpTo);//11
//        }
////______________________________________________________________________________________________
// QUESTIONS:
////_____________________________________________________________________________________________

//    *    1. Reverse a string
// *        Eg: Input to method : Sample
//        Output/Return from method : elpmaS

//        public static String getReversedString(String myWord)
//        {
//        myWord = myWord.toLowerCase();
//        String reversedName = "";
//        for (int i=myWord.length()-1; i>=0;i--)
//        {
//        reversedName += myWord.charAt(i);
//        }
//        System.out.println("Reversed name is " + reversedName);
//        return reversedName;
//        }



////______________________________________________________________________________________________


//*    2. Reverse an array (fyi: length of input array can vary)
// *      Eg: Input to method : [25, 15, 3, 2, 40] or [20, 10, 44]
// *      Output/Return from method : [40, 2, 3, 15, 25] or [44, 10, 20]
    //reversed = [44, 10, 20 ]

//        public static double[] getReversedArray (double[] myArray) {
//        double[] reversedArray = new double[myArray.length];
//        for (int i= 0; i<myArray.length; i++) {
//        reversedArray[(myArray.length-1)-i] = myArray[i];
//        }
//        System.out.println("Reversed array is " + Arrays.toString(reversedArray));
//        return reversedArray;
//        }

//OR

//public static int[] reverseIntArray(int[] userGivenArr) {
//        for (int i = userGivenArr.length - 1; i >= 0; i--) {
//        System.out.print(userGivenArr[i] + " ");
//        }
//        return userGivenArr;
//        }

////______________________________________________________________________________________________


// *    3. Add all numbers in a given array (fyi: length of input array can vary)
// *    Eg: Input to method : [20, 10, 40, 44]
// *    Output/Return from method : 114

//        public static double addNumbersinArray( double[] arrayForSum)
//        {
//        double sum=0;
//        for (int i= 0; i< arrayForSum.length; i++)
//        {
//        sum += arrayForSum[i];
//        }
//        System.out.println("The sum is " + sum);
//        return sum;
//        }

////______________________________________________________________________________________________
//      4. *Sort an array
// *    Eg: Input to method : [20, 10, 40, 44]
// *    Output/Return from method : [10, 20, 40, 44]

//    public static double[] sortArrayInAscendingOrder( double[] arrayToSort) {
//        int n = arrayToSort.length;
//                                             // One by one move boundary of unsorted subarray
//        for (int i = 0; i < n-1; i++) {
//                                            // Find the minimum element in unsorted array
//        int min = i;
//        for (int j = i+1; j < n; j++)
//        if (arrayToSort[j] < arrayToSort[min])
//        min = j;
//                                             // Swap the found minimum element with the first
//        double temp = arrayToSort[i];
//        arrayToSort[i] = arrayToSort[min];
//        arrayToSort[min] = temp;
//        }
//        return arrayToSort;
//

////______________________________________________________________________________________________
// *    5. Find Average of a given array
// *    Eg: Input to method : [20, 10, 40, 44]
// *    Output/Return from method : 28.5

//public static double findAverage(double[] arrayForAverage)
//        {
//        double sum=0;
//        for (int i= 0; i< arrayForAverage.length; i++)
//        {
//        sum = sum+arrayForAverage[i];
//        }
//        double average = sum/arrayForAverage.length;
//        System.out.println("The average is " + average);
//        return average;
//        }
////______________________________________________________________________________________________
//      6. Find maximum number in given array
// *    Eg: Input to method : [20, 10, 40, 44, 32]
// *    Output/Return from method : 44

//public static double findMaximum(double[] arrayForMaximum)
//        {
//        int n = arrayForMaximum.length;
//        double maximum = arrayForMaximum[0];
//        // One by one move boundary of unsorted subarray
//        for (int i = 0; i < n; i++)
//        {
//        if(arrayForMaximum[i]>maximum)
//        {
//        maximum=arrayForMaximum[i];
//        }
//        }
//        System.out.println("The maximum is " + maximum);
//        return maximum;
//        }
////______________________________________________________________________________________________
//      7. Find minimum number in given array
// *    Eg: Input to method : [20, 10, 40, 44]
// *    Output/Return from method : 10

//public static double findMinimum(double[] arrayForMinimum)
//        {
//        int n = arrayForMinimum.length;
//        double minimum = arrayForMinimum[0];
//        // One by one move boundary of unsorted subarray
//        for (int i = 1; i < n; i++)
//        {
//        if(arrayForMinimum[i]<minimum)
//        {
//        minimum=arrayForMinimum[i];
//        }
//        }
//        System.out.println("The minimum is " + minimum);
//        return minimum;
//        }
////______________________________________________________________________________________________

//      8. Create abbreviation for any string
// *    Eg: Input to method : Outfit of the day ( or Good morning or Happy new year)
// *    Output/Return from method : OOTD ( or GM or HMY)

//public static String findAbbreviation(String wordForAbbreviation)
//        {
//        String abbreviation = " ";
//        String[] newArr = wordForAbbreviation.split("\\s");
//        for (int i = 0; i < newArr.length; i++)
//        {
//        abbreviation = abbreviation + newArr[i].charAt(0);
//        }
//        abbreviation = abbreviation.toUpperCase();
//        System.out.println("The abbreviation is " + abbreviation);
//        return abbreviation;
//        }
////______________________________________________________________________________________________
//        9. Fibonacci Series problem

//public static int[] findFibonacciSeries(int startNumber, int length)
//        {
//        int[] arrayForFibonacci = new int[length];
//        arrayForFibonacci[0]=startNumber;
//        arrayForFibonacci[1]=arrayForFibonacci[0]+0;
//        for (int i=2; i<length; i++)
//        {
//        arrayForFibonacci[i] = arrayForFibonacci[i-1] + arrayForFibonacci[i-2];
//        }
//        System.out.println("The fibonacci series is " + Arrays.toString(arrayForFibonacci));
//        return arrayForFibonacci;
//        }
//
//public static void fibonacci(int a, int b, int n){
//        int c = 0;
//        System.out.print(a + " " + b + " ");
//        for (int i = 0; i < n - 2; i++){
//        c = a + b;
//        a = b;
//        b = c;
//        System.out.print(c + " ");
//        }
//        System.out.println();
//        }
 ////______________________________________________________________________________________________

//       10. Given two arrays, one contains total marks of 11 students of a class; second array contains their names in same order as marks-array.
//           double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
// *          String [] sNames = {“Happy”, “Peace” , “Jesse”, “Kaitlin” , “Amir”, “Donald”, “Steven”, “Vicky”, “Hannah” , “David”, “Gia”};
// *    Create a method which takes both array as parameters, and returns name of student who scored maximum marks in the class.
// *    For above example : method should return “Hannah”
// *

//public static String findStudentWithHighestScore(double[] sMarks, String[] sNames)
//        {
//        int n = sMarks.length;
//        double maxScore =sMarks[0];
//        int maxPosition=0;
//        for (int i = 1; i < n-1; i++)
//        {
//        if(sMarks[i]>maxScore)
//        {
//        maxScore=sMarks[i];
//        maxPosition = i;
//        }
//        }
//        String highestScorer = sNames[maxPosition];
//        System.out.println("The highest scorer is " + highestScorer);
//        return highestScorer;
//        }
////______________________________________________________________________________________________

// *    11. Create a method to add numbers from 0 to given number, and return the result
//          Example : addUpto(5) -> method should return 15 (bcz, 0+1+2+3+4+5 = 15)

//public static int findSumUpTo(int sumUpTo) {
//        int sum =0;
//        if (sumUpTo <0) {
//        for(int i=sumUpTo; i<=0; i++) {
//        sum = sum+i;
//        }
//        System.out.println("Sum up to " + sumUpTo + " is " + sum);
//        return sum;
//        } else {
//        for (int i = 0; i <= sumUpTo; i++) {
//        sum = sum + i;
//        }
//        System.out.println("Sum up to " + sumUpTo + " is " + sum);
//        return sum;
//        }
//        }





//}