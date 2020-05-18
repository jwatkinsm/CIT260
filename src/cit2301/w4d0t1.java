package cit2301;

import java.util.Scanner;

public class w4d0t1 {

    public static void main(String[] args) {
        //varibles
        String hex;
        //program info
        System.out.println("This program converts a hexadecimal digit into a four digit binary number.");
        //retrieve input
        Scanner input = new Scanner(System.in);
        //hexadecimal input
        System.out.print("Enter a hexadecimal number: ");
        hex= input.nextLine();
        //string length
        if(hex.length() != 1){
            System.out.println("YOu must enter exactly one chracter.");

        }
        //make sure digits are in caps
        char hexCh =Character.toUpperCase(hex.charAt(0));
        //hex digit legit test
        if('A' <= hexCh && hexCh <= 'F' || Character.isDigit(hexCh)) {
            //result options
            switch(hexCh){
                case 0:
                    System.out.println("The binary value is 0000");
                    break;
                case 1:
                    System.out.println("The binary value is 0001");
                    break;
                case 2:
                    System.out.println("The binary value is 0010");
                    break;
                case 3:
                    System.out.println("The binary value is 0011");
                    break;
                case 4:
                    System.out.println("The binary value is 0100");
                    break;
                case 5:
                    System.out.println("The binary value is 0101");
                    break;
                case 6:
                    System.out.println("The binary value is 0110");
                    break;
                case 7:
                    System.out.println("The binary value is 0111");
                    break;
                case 8:
                    System.out.println("The binary value is 1000");
                    break;
                case 9:
                    System.out.println("The binary value is 1001");
                    break;
                case 'A':
                    System.out.println("The binary value is 1010");
                    break;
                case 'B':
                    System.out.println("The binary value is 1011");
                    break;
                case 'C':
                    System.out.println("The binary value is 1100");
                    break;
                case 'D':
                    System.out.println("The binary value is 1101");
                    break;
                case 'E':
                    System.out.println("The binary value is 1110");
                    break;
                case 'F':
                    System.out.println("The binary value is 1111");
                    break;
            }
        }else{
            System.out.print(hexCh +" is not a valid hexadecimal digit");
        }
        System.out.print("Goodbye");
    }
}
