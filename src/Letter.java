public class Letter {

    public void writeLetter() {
        greeting();
        specialMessage();
        specialMessage();
        closing();
    }

    public void greeting() {
        System.out.println("Hi, friend!");
    }

    public void specialMessage() {
        System.out.println("Computer Science is cool");
    }

    public void closing() {
        System.out.println("see you soon!");
    }

    public static void main(String[] args) {
        Letter friendLetter = new Letter();
        friendLetter.writeLetter();
    }
}