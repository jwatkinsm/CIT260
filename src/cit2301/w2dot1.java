package cit2301;

import java.text.DecimalFormat;
import java.util.Scanner;

public class w2dot1 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        DecimalFormat decfor= new DecimalFormat("0.00");
       double celcius;
       double fahrenhiet;
       System.out.println("This program converts a temperature in degrees from celcius into fahrenhiet.");
        System.out.print("Enter degree in celcius:");
        celcius= input.nextDouble();
        System.out.println("the celcius is "+ (decfor.format(celcius)));
        fahrenhiet= (9.0/5) * celcius + 32;
        System.out.print((decfor.format(celcius)) + " clecius is " + (decfor.format(fahrenhiet)) + " fahrenhiet.");
    }
}
