import java.util.Scanner;

public class SimpleLogic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     SIMPLE LOGIC PROGRAM");
        System.out.println("================================");

        try {

            // Taking input from user
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // Simple calculations
            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;

            System.out.println("\n----- CALCULATIONS -----");

            System.out.println("Sum = " + sum);
            System.out.println("Difference = " + difference);
            System.out.println("Product = " + product);

            // Division
            if (num2 != 0) {

                double division = num1 / num2;

                System.out.println("Division = " + division);

            } else {

                System.out.println("Division = Cannot divide by zero.");

            }

            // Average
            double average = (num1 + num2) / 2;

            System.out.println("Average = " + average);


            // Using if-else logic
            System.out.println("\n----- RESULT -----");

            if (average >= 75) {

                System.out.println("Result: Excellent");

            } else if (average >= 50) {

                System.out.println("Result: Good");

            } else if (average >= 33) {

                System.out.println("Result: Average");

            } else {

                System.out.println("Result: Fail");

            }


            // Comparing two numbers
            System.out.println("\n----- NUMBER COMPARISON -----");

            if (num1 > num2) {

                System.out.println("First number is greater.");

            } else if (num2 > num1) {

                System.out.println("Second number is greater.");

            } else {

                System.out.println("Both numbers are equal.");

            }

        }

        catch (Exception e) {

            System.out.println(
                    "Error: Please enter valid numbers."
            );

        }

        finally {

            sc.close();

        }
    }
}