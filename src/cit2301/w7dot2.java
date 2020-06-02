package cit2301;

import java.util.Scanner;

public class w7dot2 {
    //MAIN Method
    /**
     *main Method
     * purpose to gether input from user and push inputs to mean and deviation methods
     * to calculate and get the results to display
     * @param args main output
     */
    public static void main(String[] args){
        //program info
        System.out.println("This program computes the mean and the standard deviation for a set of numbers.");
        // user input
        Scanner input= new Scanner(System.in);
        //variables
        double[]X =new double[5];

        double mean =0;
        double deviation =0;
        //methods
        Mean(X);
        Deviation(X,mean);
        //gather input and place into array
        for(int i =0;i <5; i++){
            System.out.print("Please enter a number:");
            X[i]= input.nextDouble();
            //call out methods and push array
            mean= Mean(X);
            deviation= Deviation(X,mean);
        }
        //display results
        //result from Mean(X)
        System.out.printf("The mean of this set of numbers is " +"%.2f%n",mean);
        //result from Deviation(X)
        System.out.printf("The standard deviation is " +"%.2f%n",deviation);
        System.out.print("Goodbye");
    }

    /**
     *find the average of the array of numbers
     * @param X inputed number array
     * @return mean
     */
    private static double Mean(double[] X) {
        double total= 0;
        //add the array of numbers
        for(double i: X){
            total +=i;
        }
        //divide by the number of numbers int the array
        double mean= total / X.length;
        return mean;
    }

    /**
     * find the simple deviation of the array of numbers
     * @param X inputed number array
     * @param mean result from Mean() method
     * @return deviation
     */
    private static double Deviation(double[] X, double mean) {
        double deviation;
        double devStp1 = 0;
        //subtract the number within the array to the mean
        //then multiply it to itself
                for(double i: X){
                    devStp1 +=(i - mean)*(i - mean);
                }
                //divide the devStp1 by the number of numbers in the array -1
                double devStp2 = devStp1 / (X.length -1);
                //find the square of the number
                deviation =Math.pow(devStp2,0.5);
        return deviation;
    }
}
