package chapter3;


import java.util.Scanner;

public class TestResults {
    public static void main (String args[]) {

        //Get test score
        System.out.println("What is your score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //Determine Grade
        char grade;
        if (score < 60) {
            grade = 'F';
        }
            else if(score <70){
                grade = 'D';
            }
                else if(score <80){
                 grade = 'C';
                }
                    else if(score <95){
                        grade = 'B';
                    }
                        else {
                            grade = 'A';
                        }
        System.out.println("Your grade is " + grade);
    }
}

