package cit2301;


import java.util.Scanner;

public class w2dot1 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
       double celcius;
       double fahrenhiet;
       String s1= "celcius is";
       String s2= "in fahrenheit";
       System.out.println("This program converts a temperature in degrees from celcius into fahrenhiet.");
        System.out.print("Enter degree in celcius:");
        celcius= input.nextDouble();
        System.out.printf("the celcius is "+ "%.2f%n",celcius);
        fahrenhiet= (9.0/5) * celcius + 32;
        System.out.printf("%.2f %s %.2f %s",celcius,s1,fahrenhiet,s2);
    }
}
