public class mathClass {
    public static void main(String[] args) {
        // Absolute Value
        int x = Math.abs(-5);
        System.out.println(x);

        // Exponential Powers
        double y = Math.pow(4,9);
        System.out.println(y);

        // Square Roots
        double z = Math.sqrt(6.25);
        System.out.println(z);

        // Random Numbers
        double rand = Math.random();
        int a = (int) (Math.random() * 10); // Generates a decimal between 0.0 and 0.99 then multiples it by 10
        System.out.println(a);
        int b = (int) (Math.random() * 11) + 10;
        /*
        1. Generates decimal between 0.0 and 0.99
        2. Multiply by the number of values in the range
        3. Casts the variable to an int
        4. Adds the offset aka 10
         */
        System.out.println(b);


    }
}
