public class ifStatement {
    public static void main(String[] args) {
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        }

        // Now with the else statement
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        } // Outputs "Good evening."


    /* Syntax of whole if statement
    if (condition1) {
      // block of code to be executed if condition1 is true
    } else if (condition2) {
      // block of code to be executed if the condition1 is false and condition2 is true
    } else {
      // block of code to be executed if the condition1 is false and condition2 is false
    }
     */
        int timeOne = 12;
        if (timeOne < 10) {
            System.out.println("Good morning.");
        } else if (timeOne < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // Outputs "Good evening."

        

    }
}
