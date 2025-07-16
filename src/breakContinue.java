public class breakContinue {
    public static void main(String[] args) {
        // break statement can also be used to jump out of a loop

        // Stops the loop when i is equal to 4
        for (int a = 0; a < 10; a++) {
            if (a == 4) {
                break;
            }
            System.out.println(a);
        }

        /* continue statement breaks one iteration (in the loop),
         if a specified condition occurs,
         and continues with the next iteration in the loop
         */

        // This example skips the value of 4
        for (int b = 0; b < 10; b++) {
            if (b == 4) {
                continue;
            }
            System.out.println(b);
        }

        // You can also use break and continue in while loops
        // Break
        int c = 0;
        while (c < 10) {
            System.out.println(c);
            c++;
            if (c == 4) {
                break;
            }
        }
        // Conitnue
        int d = 0;
        while (d < 10) {
            if (d == 4) {
                d++;
                continue;
            }
            System.out.println(d);
            d++;
        }


    }
}
