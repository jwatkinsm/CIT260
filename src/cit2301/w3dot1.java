package cit2301;

import java.util.Scanner;

public class w3dot1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input variables
        byte currentDate, daysintoFuture, futureDate;
        //tell the program purpose
        System.out.println("Given today's day of the week and some number of days in the future\n" +
                "this program will tell you the day of the week for the future day.\n");
        //retrieve input info
        //current date
        System.out.print("Enter today's day of the week (0 for Sunday, 1 for Monday, etc):");
        currentDate= input.nextByte();
        //current date check postive
        if(currentDate >0 && currentDate <7){
            //retrieve input info
            //days into Future
            System.out.print("Enter the number of days in the future:");
            daysintoFuture= input.nextByte();
            //daysintoFuture check postive
            if(daysintoFuture >0){
                futureDate= (byte)(currentDate + daysintoFuture);
                if(futureDate >6){
                    futureDate %= 7;
                }
                //input result cases
                switch (futureDate){
                    case 0: System.out.print("The future date is Sunday");
                        break;
                    case 1: System.out.print("The future date is monday");
                        break;
                    case 2: System.out.print("The future date is tuesday");
                        break;
                    case 3: System.out.print("The future date is wednesday");
                        break;
                    case 4: System.out.print("The future date is thursday");
                        break;
                    case 5: System.out.print("The future date is friday");
                        break;
                    case 6: System.out.print("The future date is saturday");
                        break;
                }
            }
            //daysintoFuture check neagative
            else{
                System.out.print(daysintoFuture + " is invalid. You must enter a positive number.\n");
                System.out.print("Goodbye");
            }
            }
        //current date check negative
        else{
            System.out.print( currentDate + " is invalid must be between 0 and 6\n");
            System.out.print("Goodbye");
        }
    }





}
