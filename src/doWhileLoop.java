public class doWhileLoop {
    public static void main(String[] args) {
        /* Syntax
        do {
            // code block to be executed
        }
        while (condition);
         */
        // The semicolon ; after the while condition is required!

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        /* In the example below, the variable i starts at 10, so the condition i < 5 is false immediately -
        yet the do/while loop still runs once
         */
        int x = 10;
        do {
            System.out.println("x is " + x);
            x++;
        } while (x < 5);


    }
}
