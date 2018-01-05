/*
Name: Ahmad Alkurdy
Date: 2/7/2017
Purpose: application that inputs three integers from the user and displays the
sum, average, product, smallest and largest of the numbers. [Note: The
calculation of the average in this exercise should result in an integer
representation of the average. So if the sum of the values is 7, the average
should be 2, not 2.3333….]
 */
//page 47 in text book
package addition;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);

        //declaring integer variables
        int number1;
        int number2;
        int number3;
        int sum;
        int product;
        int average;
        int smallest;
        int largest;
        
        //prompting the user to take data in for the three numbers
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        System.out.print("Enter third integer: ");
        number3 = input.nextInt();
        
        //calculating the sum and the product and the average and display the 
        //results on the screen
        sum = number1 + number2 + number3;
        System.out.printf("Sum is %d\n", sum);
        product = number1*number2*number3;
        System.out.printf("Product is %d\n", product);
        average = (number1 + number2 + number3)/ 3;
        System.out.printf("Average is %d\n", average);
        
        //if statment to compare the numbers and display the biggest and smallest
        smallest = number1; // assume smallest is the first number
        if (number2 < smallest)
            smallest = number2;
        if (number3 < smallest)
            smallest = number3;
         
        largest = number1; // assume largest is the first number
        if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;
        System.out.printf("The smallest number is: %d\n", smallest);
        System.out.printf("The largest number is: %d\n", largest);
    }
    
}
