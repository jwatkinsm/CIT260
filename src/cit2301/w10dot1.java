package cit2301;

import java.util.ArrayList;
import java.util.Scanner;

public class w10dot1 {
    public static void main(String[] args) {
        //program info
        System.out.println("This program gets input for three triangles from the user.\n" +
                "It then creates three Triangle objects and displays the\n" +
                "description of each.");
        Scanner input = new Scanner(System.in);
        //variable for each object
        String[] Color= new String[3];
        boolean[] filled= new boolean[3];
        double[] Side1 = new double[3];
        double[] Side2 = new double[3];
        double[] Side3 = new double[3];
        char fillOrNot;
        //user input for each object
        for( int i =0;i <3;i++) {
            System.out.println("Enter the color of a triangle (e.g. 'red'):");
            Color[i] = input.nextLine();
            System.out.println("Is the triangle filled (y or n):");
            fillOrNot = input.next().charAt(0);
            //filled char to boolean outputs
            if(fillOrNot == 'y' || fillOrNot =='Y'){
                filled[i] = true;
            }
            else if(fillOrNot == 'n' || fillOrNot =='N'){
                filled[i] = false;
            }
            else{
                System.out.println("input must be y or n.");
            }
            System.out.println("Enter the lengths of the three sides of the triangle with a space in between them:");
            Side1[i] = input.nextDouble();
            Side2[i] = input.nextDouble();
            Side3[i] = input.nextDouble();
            //empty line
            input.nextLine();
        }
//objects
        triangle tri1 = new triangle(Side1[0], Side2[0], Side3[0],Color[0],filled[0]);
        triangle tri2 = new triangle(Side1[1], Side2[1], Side3[1],Color[1],filled[1]);
        triangle tri3 = new triangle(Side1[2], Side2[2], Side3[2],Color[2],filled[2]);
        //arraylist
        ArrayList<GeometricObject> triangles = new ArrayList<GeometricObject>();
        //add objects
        triangles.add(tri1);
        triangles.add(tri2);
        triangles.add(tri3);
        //to string outputs
        System.out.printf(tri1.toString()+ "Area =" +"%.2f%n%n",tri1.getArea());
        System.out.printf(tri2.toString()+ "Area =" +"%.2f%n%n",tri2.getArea());
        System.out.printf(tri3.toString()+ "Area =" +"%.2f%n%n",tri3.getArea());
    }
}
