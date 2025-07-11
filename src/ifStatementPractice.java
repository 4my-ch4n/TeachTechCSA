public class ifStatementPractice {
    public static void main(String[] args) {
        // use if..else to "open a door" if the user enters the correct code
        int doorCode = 1337;

        if (doorCode == 1337) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }

        // use if..else to find out if a number is positive or negative
        int myNum = 10; // Is this a positive or negative number?

        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }

        // Now try writing teh code to see if someone is at the age to vote
    }
}
