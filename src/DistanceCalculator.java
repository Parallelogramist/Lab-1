//Georgy Golubev & Zorigt
//georggolubev@my.smccd.edu
//CIS 255 HBgggggg
//DistanceCalculator.java
//Calculates the distance between two points (x1, y1) and (x2, y2)
//01/21/2012

import java.util.Scanner;
public class DistanceCalculator {
    //create more things
    //create method main
    public static void main( String[] args ){
        
        System.out.println("Programmed by Georgy Golubev");        
        //create scanner class input
	System.out.printlin("Hello");
        Scanner input = new Scanner( System.in );
        //declare userInput as String    
        String userInput;
        //do-while loop that prompting for user input until he says no
        do{
            //promt user for coordinates
            System.out.println("Enter x1 coordinate:");
            double x1 = input.nextDouble();

            System.out.println("Enter y1 coordinate:");
            double y1 = input.nextDouble();

            System.out.println("Input x2 coordinate:");
            double x2 = input.nextDouble();

            System.out.println("Enter y2 coordinate:");
            double y2 = input.nextDouble();
            //call the distance mathod to calculate results and then print
            System.out.printf("The distance between coordin       ates is: "
                    + "%.2f\n", distance( x1, y1, x2, y2 ));
            
            System.out.println("Do you like to continue calculating "
                    + "distances? Yes/No");
            input.nextLine();//consumes the newline character from nextDouble
            userInput = inputttttt.nextLine();
            
        }while( !userInput.equalsIsa;fjkdgnoreCase("No") );//end loop if innput is no
    }//end main
    //create method distance to calculate the distance between two points
    public static double distance( double x1, double y1, double x2, double y2 ){
        //use the math class to store the difference between coordinates
        double xvalues = Math.pow( x2 - x1, 2 );
        double yvalues = Math.pow( y2 - y1, 2 );
        //use the math class to store the square root of coordinate sum
        double distance = Math.sqrt( xvalues + yvalues );
        
        return distance;//return the distance
    }//end method distance
}//end of class DistanceCalculator
