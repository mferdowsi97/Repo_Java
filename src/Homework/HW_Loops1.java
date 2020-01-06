package Homework;

public class HW_Loops1 {

    public static void main(String[] args) {

// 1.Students score, total possible score
//   15/20 -> You got a C (75%)
//   A 90-100, B 80-89, C 70-79, D 60-69, F 0-59


        int score = 12;
        int maxScore = 20;
        int percentage = score/maxScore;

        if (percentage == 90 <= percentage <= 100) {
            System.out.println("Student score is A");
        } else if (percentage == 80 <= percentage <= 89) {
            System.out.println("Student score i B");
        } else if (percentage == 70 <= percentage <= 79) {
            System.out.println("Student score i C");
        } else if (percentage == 60 <= percentage <= 69) {
            System.out.println("Student score i D");
        } else
            System.out.println("Student score i F");

        System.out.println(percentage);

//2. Write a logic that prints multiplication table of the user provided number upto ten.

        for (int i = 0; i <= 100; i = i+10) {
            System.out.println(i);
        }

//3. Write a logic that checks if a number is a Prime number

        int number = 11;

        if (number &

                //I am not sure how to do this one











    }
}
