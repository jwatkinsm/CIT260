package cit2301;


import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class w11dot1 {
    public static void main(String[] args)  {
        //variables
        Scanner input = new Scanner(System.in);
        int i =0;
        int[] intergers = new int[10];
        double sum =0;
        double average =0;
        //system info prompt
        System.out.println("This program gets ten numbers from the user, and\n" +
                "computes and displays the average.\n");
        System.out.println("Please enter ten integer values");

        //user enter integers
        do {
                try {
                    System.out.println("Enter integer " + (i + 1) + ":");
                    intergers[i] = input.nextInt();
                    i++;
                } catch (InputMismatchException ex) {
                    System.out.println("Error: input must be an integer.");
                    input.nextLine();
                }
        }while(i < 10);

        //write array to file
        try (java.io.PrintWriter myFile = new PrintWriter("data.txt")) {
            for (i = 0; i < intergers.length; i++) {
                myFile.println(intergers[i]);
            }
        } catch (IOException e) {
            System.out.println("File cannot be opened");
        }

        //read the array and find the average of the integers
        File dataFile = new File("data.txt");
        try (Scanner data = new Scanner(dataFile)) {
            while (data.hasNextLine()) {
                String line = data.nextLine().trim();
                sum += Integer.parseInt(line);
                average = sum / intergers.length;
            }
        } catch (IOException e) {
            System.out.println("Error reading the data");
        }

        System.out.printf("the Average is " + "%.2f",average);
    }
}
