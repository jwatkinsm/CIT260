package cit2301;

import java.util.Scanner;

public class w4dot2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //varables
        double hours, hrWage, gross, stateTax, fedTax, netPay;
        double sTax= 0.09;
        double fTax= 0.20;
        String name;
        String s1= "Pay Stub for ";
        String s2= "Hours worked: ";
        String s3= "Hourly Wage: $";
        String s4= "Gross pay: $";
        String s5= "State Tax Withheld: $";
        String s6= "Federal Tax Withheld: $";
        String s7= "Net pay: $";
        //program details
        System.out.println("Given your name, hours worked, and hourly wage, this program calculates your \n" +
                "gross pay, state withholding tax, federal withholding tax, and your net pay.\n" +
                "It then displays your pay stub.");
        //retrieve inputs
        //name
        System.out.print("Enter your first and last name: ");
        name = input.nextLine();
        //hrs
        System.out.print("Enter the hours you worked this week: ");
        hours= input.nextDouble();
        //hourly Wage
        System.out.print("Enter your hourly wage: ");
        hrWage= input.nextDouble();
        //Estimate gross pay
        gross= hours * hrWage;

        //estimate taxes
        //state
        stateTax= gross * sTax;
        //federal
        fedTax= gross * fTax;

        //estimate net worth
        netPay= gross - stateTax - fedTax;
        //output
                        //line1   line2   line3    line4    line5    line6    line7
        System.out.printf("%s%s %n%s%.2f %n%s%.2f %n%s%.2f %n%s%.2f %n%s%.2f %n%s%.2f",s1,name,s2,hours,s3,hrWage,s4,gross,s5,stateTax,s6,fedTax,s7,netPay);
    }
}
