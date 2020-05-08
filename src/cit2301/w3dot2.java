package cit2301;

import java.util.Scanner;

public class w3dot2 {
    public static void main(String[] args){
        //varibles
        byte month;
        int year;
        int days;
        //retrieve inputs
        Scanner input = new Scanner(System.in);
        //retrieve year
        System.out.print("Enter the year: ");
        year= input.nextInt();
        //retrieve month
        System.out.print("Enter the month: ");
        month = input.nextByte();
        //check if month input is between 1-12
        if( month >0 && month <13) {

            //if so check if it is the second month
            if (month == 2) {

                //if so check if divisable by 4
                if (year % 4 == 0) {

                                        //if so check if divisable by 100
                                        if (year % 100 == 0) {

                                                                        //if so check if divisable by 400
                                                                        if (year % 400 == 0) {
                                                                            days = 29;
                                                                        //if not divisable by 400
                                                                        } else {
                                                                            days = 28;
                                                                        }
                                            //if not divisable by 100
                                        } else {
                                            days = 29;}
                  // if not divisable by 4
                } else{
                        days = 28;
                    }
                 //result output
                System.out.println("february " + year + " has " + days + " days");
                //outputs for other months
            }else{
             switch(month){
                 case 1:
                     System.out.println("Janurary " + year +" has 31 days");
                     break;
                 case 3:
                     System.out.println("March " + year +" has 31 days");
                     break;
                 case 4:
                     System.out.println("April " + year +" has 30 days");
                     break;
                 case 5:
                     System.out.println("May " + year +" has 31 days");
                     break;
                 case 6:
                     System.out.println("June " + year +" has 30 days");
                     break;
                 case 7:
                     System.out.println("July " + year +" has 31 days");
                     break;
                 case 8:
                     System.out.println("August " + year +" has 31 days");
                     break;
                 case 9:
                     System.out.println("September " + year +" has 30 days");
                     break;
                 case 10:
                     System.out.println("October " + year +" has 31 days");
                     break;
                 case 11:
                     System.out.println("November " + year +" has 30 days");
                     break;
                 case 12:
                     System.out.println("December " + year +" has 31 days");
                     break;
             }
            }
            //invalid input
        }else{
            System.out.println(month + " is invalid. Month values must be between between 1 and 12, inclusive.");
        }
        System.out.print("Goodbye");

    }
}
