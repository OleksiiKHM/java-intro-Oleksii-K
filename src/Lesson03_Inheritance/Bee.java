package Lesson03_Inheritance;

public class Bee extends Insect {
    public Bee(int size, String color) {
        super(size, color);
    }

    public void move() {
        printFlyExtracted();

    }

    /*public void attack() {
        //move();
        printFlyExtracted();
        super.attack();
    }*/

    private void printFlyExtracted() {
        System.out.println("Fly");
    }

    public static void main(String[] args) {
        Bee bee = new Bee(12, "yellow");
        bee.attack();
    }

}

