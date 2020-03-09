import java.text.DecimalFormat;

import java.util.Scanner;

public class SciCalculator {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        double sumValues = 0;
        double numValues = 0;
        double currentValue = sumValues;
        int number;
        do { // Loops the Program until the exit command is entered

            System.out.println("\nCurrent Result: " + currentValue); // Displays the value for every calculation

            // Displays the Calculator Menu and the Available Operations
            System.out.println("\nCalculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition ");
            System.out.println("2. Subtraction ");
            System.out.println("3. Multiplication ");
            System.out.println("4. Division ");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");

            do { // Codes for input 7 and the various feedback
                System.out.println("\nEnter Menu Selection: ");
                number = scnr.nextInt();
                if (number < 0 || number > 7) {
                    System.out.println("Error: Invalid selection!");
                }
                else if (sumValues == 0 && number == 7){
                    System.out.println("Error: No calculations yet to average!");
                }
                else if (number == 7) {
                    // Codes for input 7
                    System.out.println("Sum of calculations: " + sumValues);

                    System.out.println("Number of calculations: " + Math.round(numValues));

                    // Rounds Decimal Calculation
                    DecimalFormat df = new DecimalFormat("0.00");
                    double averageCalculation = (sumValues / numValues);

                    System.out.print("Average of calculations: ");
                    System.out.println(df.format(averageCalculation));
                }


            } while ((number < 0 || number >= 7 ) );

            if (number > 0) { // Codes for inputs 1-6
                double val1;
                double val2;


                // User input #1 operand
                System.out.print("Enter first operand: ");
                val1 = scnr.nextDouble();

                // User input #2 operand
                System.out.print("Enter second operand: ");
                val2 = scnr.nextDouble();


                // Codes for the specific input required for the different operands

                switch (number) {
                    case 1: // Sum calculation
                        currentValue = (val1 + val2);
                        sumValues = sumValues + currentValue;
                        break;
                    case 2:
                        currentValue = (val1 - val2); // Subtract calculation
                        sumValues = sumValues + currentValue;
                        break;
                    case 3:
                        currentValue = (val1 * val2); // Multiplication calculation
                        sumValues = sumValues + currentValue;
                        break;
                    case 4:
                         currentValue = (val1 / val2); // Division calculation
                         sumValues = sumValues + currentValue;
                        break;
                    case 5:
                        currentValue = (Math.pow(val1, val2)); // Exponentiation calculation
                        sumValues = sumValues + currentValue;
                        break;
                    case 6:
                        currentValue = (Math.log(val2) / Math.log(val1)); // Log calculation
                        sumValues = sumValues + currentValue;
                        break;
                    default:
                        System.out.print("Error: Invalid selection!");
                }
            }   else {
                System.out.println("Thanks for using this calculator. Goodbye!");
            }

            numValues = numValues + 1; // Keeps track of number of calculations
        } while (number != 0) ;

    }
}