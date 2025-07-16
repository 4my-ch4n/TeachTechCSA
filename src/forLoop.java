 public class forLoop {
    public static void main(String[] args) {
        /* for (statement 1; statement 2; statement 3) {
            // code block to be executed
        }

        Statement 1 is executed (one time) before the execution of the code block.

        Statement 2 defines the condition for executing the code block.

        Statement 3 is executed (every time) after the code block has been executed
         */

        // The example below will print the numbers 0 to 10
        for (int a = 0; a < 11; a++) {
            System.out.println(a);
        }
        /*
        Statement 1 sets a variable before the loop starts: int i = 0
        Statement 2 defines the condition for the loop to run: i < 5.
        (If the condition is true, the loop will run again; if it is false, the loop ends.)
        Statement 3 increases a value each time the code block has run: i++
         */

        // This example prints even values between 0 and 20
        for (int b = 0; b <= 20; b = b + 2) {
            System.out.println(b);
        }

        // This example calculates the sum of numbers from 1 to 10
        int sum = 0;
        for (int c = 1; c <= 10; c++) {
            sum = sum + c;
        }
        System.out.println("Sum is " + sum);

        // This example prints a countdown from 5 to 1
        for (int d = 5; d > 0; d--) {
            System.out.println(d);
        }

        // A program that counts to 100 by tens
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(i);
        }

        // Only print even values between 0 and 10
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        // Prints the multiplication table for a specified number
        int number = 2;
        // Print the multiplication table for the number 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

    }
}
