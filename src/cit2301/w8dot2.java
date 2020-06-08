package cit2301;

import java.util.Date;

public class w8dot2 {
    /**
     * UML
     * class: java.util.Date
     * constructors:
     *              Date()
     *              Date(elapseTime:long)
     * methods:
     *          toString(): String
     *          getTime(): long
     *          setTime(elapseTime: long):void
     * @param args outputs date and time with the given milliseconds
     */
    public static void main(String[] args) {
        //variables
        Date date = new Date(100000L);
        Date date1= new Date(1000000L);
        Date date2= new Date(10000000L);
        Date date3= new Date(100000000L);
        Date date4= new Date(1000000000L);
        Date date5= new Date(10000000000L);
        Date date6= new Date(100000000000L);
        Date date7= new Date(1000000000000L);
        //program info
        System.out.println("This program uses the Date class to display a set of dates and times.");
        //variables outputs
        System.out.print(date.getTime() + ": :");
        System.out.println(date.toString());

        System.out.print(date1.getTime() + ": :");
        System.out.println(date1.toString());

        System.out.print(date2.getTime() + ": :");
        System.out.println(date2.toString());

        System.out.print(date3.getTime() + ": :");
        System.out.println(date3.toString());

        System.out.print(date4.getTime() + ": :");
        System.out.println(date4.toString());

        System.out.print(date5.getTime() + ": :");
        System.out.println(date5.toString());

        System.out.print(date6.getTime() + ": :");
        System.out.println(date6.toString());

        System.out.print(date7.getTime() + ": :");
        System.out.println(date7.toString());

        System.out.print("\nGoodbye");
    }

}
