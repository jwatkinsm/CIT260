package cit2301;

import java.util.Scanner;

public class w6dot1 {
    public static void main(String[] args) {
        //get user input
        Scanner input= new Scanner(System.in);
        //Variables
        double invested,interestRate;
        int years;
        //program info
        System.out.println("Given an investment amount and an annual interest rate, this program \n" +
                            "will calculate the future value of the investment for a period of\n" +
                            "ten years.");
        //input investment
        System.out.print("Enter the a positive, non-zero value for the investment:");
        invested= input.nextDouble();
        //check investment is greater than 0 if so check interest
        if(invested >0) {
            System.out.print("Enter an annual interest rate, between 0 and 100:");
            interestRate= input.nextDouble();
            //check interest is between 0 and 100 if so continue program
            if(interestRate >=0 && interestRate <=100){
                //table head
                System.out.println("Years\tFuture Value");
               //Calculate monthly compound interest gain after each year
                for(years =1; years <=10; years++){
                    double futureValue = FutureValue(invested ,interestRate,years);
                    //display table results
                    System.out.printf(years +"\t\t%.2f\n",futureValue);
                }
            }
            //if interest is not between 0-100
            else{
                System.out.println("Interest rate must be between 0 and 100");
            }
        }
        //if investment is not greater than 0
        else{
            System.out.println(" Investment must be greater than Zero");
        }
        System.out.print("Goodbye");

    }//method for futureValue variable and calculate dividend earned per year
    public static double FutureValue(double investment, double interest, int years){
        double Rate= (interest/12)*0.01;
        return investment * Math.pow((1+Rate),years*12);
    }
}
