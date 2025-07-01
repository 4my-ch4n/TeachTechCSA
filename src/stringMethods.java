public class stringMethods {
    public static void main(String[] args) {
        String name = "TeachTech";
        String newName = name.toUpperCase();
        System.out.println(name);
        System.out.println(newName);

        // Immutability
        name = "Amy";
        System.out.println(name);

        // Concatenation
        String firstName = "Teach";
        String lastName = "Tech";
        String fullName = firstName + lastName; // "adds" the strings together
        System.out.println(fullName);

        // Concatenation w/ +=
        firstName += "Tech";
        System.out.println(firstName);

        // Concatenating primitives
        int age = 1;
        System.out.println(name + " is " + age);

        // Practice
        int currentAge = 20;
        int numberOfYears = 10;
        System.out.println("In ten years, I will be " + currentAge + numberOfYears);
        System.out.println("in ten years, I will be " + (currentAge + numberOfYears));
    }
}
