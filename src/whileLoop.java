public class whileLoop {
    public static void main(String[] args) {
        /* Syntax
        while (condition) {
        // code block to be executed
        }
         */

        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        // Do not forget to increase the variable used in the condition (i++), otherwise the loop will never end!

        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

    }
}
