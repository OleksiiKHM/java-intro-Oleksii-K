package Lesson03_Inheritance;

public class Bee extends Insect {
    public Bee(int size, String color) {
        super(size, color);
    }

   /* public void move() {
        System.out.println("Fly");
    }*/

    public void attack() {
        move();
        super.attack();
    }

    public static void main(String[] args) {
        Bee bee = new Bee(12, "yellow");
        bee.attack();

    }

}

/*private void printFlyExtracted() {
        System.out.println("Fly");
    }*/