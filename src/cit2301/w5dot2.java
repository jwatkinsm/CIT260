package cit2301;

public class w5dot2 {
    public static void main(String[] args){
        //program info
        System.out.println("This program displays all of the numbers from 100 to 1000\n" +
                "that are divisible by both 5 and 6.\n");
        //variables
        int numCount= 0;
        boolean linecount;
        final short COUNT=1000;
        //counting loop
        for(int i =100; i<=COUNT; i++){
            //don't linecount if not divisble by 5 or 6
            linecount= false;
            //check if divisble by 5 and 6 and linecount
            if(i %5 ==0 && i %6 ==0){
            System.out.print(i +" ");
            numCount++;
            linecount= true;
            }
            //10 numbers per line and output
            if( numCount %10 ==0 && linecount){
                System.out.println();
            }
        }
        System.out.print("Goodbye");
    }
}
