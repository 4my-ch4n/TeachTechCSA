public class Frog {
    public void move() {
        System.out.println("The frog moved forward 3 hops.");
    }

    public void move(int numHops) {
        System.out.println("The frog moved forward " + numHops + " hops.");
    }

    public void move(String direction, int hops) {
        System.out.print("The frog moved to the " + direction);
    }

    public static void main(String[] args) {
        Frog frog1 = new Frog();
        frog1.move();
        Frog frog2 = new Frog();
        frog2.move("left", 10);
        frog1.move(3);
    }
}
