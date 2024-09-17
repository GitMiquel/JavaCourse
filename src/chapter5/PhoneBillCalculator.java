package chapter5;

import java.util.Scanner;
/*
Enter base cost of the plan:
        82.45
Enter overage minutes:
        9
Phone Bill Statement
Plan: $82.45
Overage: $2.25
Tax: $12.71
Total: $97.41
 */


public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);




    public static void main(String args[]){

        //Obtain Data
        double plan = getPlan();
        double overage = getOverage() * 0.25;
        scanner.close();

        //Calculate Output
        double tax = (plan + overage) * 0.15;
        double total = calculateTotal(plan, overage, tax);

        System.out.println("Phone Bill Statement\n" + "Plan: " + plan + "\n" + "Overage: " + overage + "\n" + "Tax: " + tax + "\n" + "Total: " + total);




    }

    //Obtain Data
    public static double getPlan(){
        System.out.println("Enter base cost of the plan:");
        double plan = scanner.nextDouble();
        return plan;
    }

    public static double getOverage(){
        System.out.println("Enter overage minutes:");
        double overage = scanner.nextDouble();
        return overage;
    }



    //Calculate Output
    public static double calculateTotal(double plan, double overage, double tax){
        double total = plan + overage + tax;
        return total;
    }

}
