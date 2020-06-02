package cit2301;

import java.util.Scanner;
import java.util.stream.IntStream;

public class w7dot1 {
    //MAIN Method
    /**
     * the main method to collect all user inputs and push and recieve from result from Average()
     * @param args output program
     */
    public static void main(String[] args){
        //program info
        System.out.println("This program calculates the average of five numbers.");
        //collect input data
        Scanner input= new Scanner(System.in);
        //variables
        double[]numbers= new double[5];
        double average =0;
        //method call
        Average(numbers);
        // collect and Store user input to array
        for( int i =0;i <5; i++){
            System.out.print("Please enter a number:");
            numbers[i]= input.nextDouble();
            average= Average(numbers);
        }
        //output average result
        System.out.printf("The average of these five numbers is " +"%.2f%n",average);
        System.out.println("Goodbye");
    }
    //AVERAGE Method
    /**
     * Average method
     * to add the number inputs from array and divide by the length of the array then return
     * result(average)to the main method
     * @param numbers user inputed array
     * @return average
     */
    private static double Average(double[]numbers) {
        //add user input array values together
        double total= 0;
        for(double i:numbers){
            total +=i;
        }
        //divide by the length of the array
        double average= total / numbers.length;
        //return result
        return average;
    }
}
