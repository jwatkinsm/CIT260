package cit2301;

import java.util.Scanner;

public class w2dot1 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
       double celcius;
       double fahrenhiet;
       System.out.println("This program converts a temperature in degrees from celcius into fahrenhiet.");
        System.out.print("Enter degree in celcius:");
        celcius= input.nextDouble();
        System.out.println("the celcius is "+ celcius);
        fahrenhiet= (9.0/5) * celcius + 32;
        System.out.print(celcius + " clecius is " + fahrenhiet + " fahrenhiet.");
    }
}
