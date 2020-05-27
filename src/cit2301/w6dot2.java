package cit2301;

public class w6dot2 {
    public static void main(String[] args) {
        //Program info
        System.out.println("THis program shows you an table of celcius and Fahrenhiet tables");
        //table head
        System.out.println("\tCelsius\t\tFahrenheit\t|\tFahrenheit\t\tClesius\n" +
                "\t-----------------------------------------------------");
        //intial temp readings starting point variables
        double celsius =40;
        double fahrenhiet =120;
        //count down celsius by and Fahrenhiet by 10 and display results
        for(int i =1; i <=10; celsius--, fahrenhiet -=10, i++){
            System.out.printf("\t%.1f\t\t%.2f\t\t%s\t%.1f\t\t\t%.2f\n",celsius,celsiusToFahrenheit(celsius),"|",fahrenhiet,fahrenheitToCelsius(fahrenhiet));

        }
        System.out.print("goodbye");
    }
//method for converting Fahrenhiet to Celsius
    private static double fahrenheitToCelsius(double tempFahrenhiet) {
        return (5.0 / 9) * (tempFahrenhiet -32);
    }
//method for converting Celsius to Fahrenhiet
    private static double celsiusToFahrenheit(double tempCelsius) {
        return (9.0/5.0)* tempCelsius +32;
    }
}