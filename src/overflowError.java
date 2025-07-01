public class overflowError {
    public static void main(String[] args) {
        // Which one produces the overflow error?
        int numOne = 98568957;
        int numTwo = 59871112;
        int result = numOne + numTwo;
        System.out.println(result);

        /* int numThree = 462001478;
        double numFour = 1523744.12;
        int resultTwo = (int) (numThree * numFour);
        System.out.println(resultTwo);
         */
    }
}