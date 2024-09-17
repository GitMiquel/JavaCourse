package chapter4;

//NESTED LOOPS

import java.util.Scanner;

public class AverageTestScores {

        public static void main(String args[]) {

            //Initialize known data
            int numberOfStudents = 24;
            int numberOfTests = 4;




            //Process all students
           for (int i = 0; i < numberOfStudents; i++){

               double total = 0;
               for (int j = 0; j < numberOfTests; j++){
                   System.out.println("Enter the score for test " + (j+1) + "for student " + (i+1));
                   Scanner scanner = new Scanner(System.in);
                   double score = scanner.nextDouble();
                   total = total + score;
               }

               double averageScore = total / numberOfTests;
               System.out.println("The average score for student " + (i+1) + " is " + averageScore);
           }

        }

}
