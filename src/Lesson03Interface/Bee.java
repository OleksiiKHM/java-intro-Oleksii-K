package Lesson03Interface;

public class Bee extends Insect implements Attack_Interface{
    private Attack_Interface attack;

    public Bee(int size, String color, Attack_Interface attack){
        super(size, color);
        this.attack = attack;
    }

    public void move() {
        attack.move();
    }

    public void attack() {
        attack.attack();
    }

    public static void main(String[] args) {
        Attack_Impl imp = new Attack_Impl("fly", "Sting");
        Bee bee = new Bee(12, "yellow", imp);
        bee.attack();

       /* Bee bee1 = new Bee(15, "red", new Attack_Impl2("sting","fly"));
        bee1.attack();*/
    }
}
