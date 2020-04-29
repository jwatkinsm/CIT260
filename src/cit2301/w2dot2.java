package cit2301;

import java.util.Scanner;

public class w2dot2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double meal,tipRate,Tip,total,Tax;
        double taxRate= 3.2 / 100;
        System.out.println("Given the price of a meal and a percentage to use for the tip,this program calculates the tip, the tax, and the total amount of the bill.");
        System.out.print("Enter degree in meal:");
        meal= input.nextDouble();
        System.out.print("Enter degree in tip:");

        tipRate= input.nextDouble() / 100;
        Tip= meal * tipRate;
        System.out.printf("The tip is $"+"%.2f%n",Tip);

        Tax= meal * taxRate;
        System.out.printf("the tax is $"+"%.2f%n",Tax);

        total= meal + Tip + Tax;
        System.out.printf("The total bill is $"+"%.2f%n",total);
        System.out.print("Goodbye");
    }
}
