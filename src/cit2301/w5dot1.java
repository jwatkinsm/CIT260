package cit2301;

public class w5dot1 {
    public static void main(String[] args) {
        //program info
        System.out.println("This program is going to show you kilograms equivliant in Pounds.");
        //table headings
        System.out.println("\tkilograms\tPounds\n" +
                "-----------------------------");
        //variables
        final short SIZE= 20;
        //loop
        for(int i =0; i <= SIZE; i++){
            //skip if even
            if(i % 2 ==0){
                continue;
            }
            //kilograms to pounds
            double pounds= (i *2.2);
            //outcome
            System.out.printf("\t"+ i +"\t\t\t" +"%.1f%n",pounds);
        }
        System.out.print("\nGoodbye");
    }
}
