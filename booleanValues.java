public class booleanValues {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(!isJavaFun);     // Outputs true
        System.out.println(!isFishTasty);   // Outputs false

        // Comparison operator
        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9
        // The exact same thing
        System.out.println(10 > 9); // returns true, because 10 is higher than 9

        // Equal to (==)
        int z = 10;
        System.out.println(z == 10); // returns true, because the value of z is equal to 10
        System.out.println(10 == 15); // returns false, because 10 is not equal to 15

        /* Real Life Example:
        We need to find out if a person is old enough to vote
         */
        int myAge = 15;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);
    }
}
