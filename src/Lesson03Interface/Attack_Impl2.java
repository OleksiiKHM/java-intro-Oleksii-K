package Lesson03Interface;

public class Attack_Impl2 implements Attack_Interface {
    String attack;
    String move;


    public Attack_Impl2(String attack, String move) {
        this.attack = attack;
        this.move = move;
    }

    @Override
    public void move() {
        System.out.println(move + " fast");
    }

    @Override
    public void attack() {
        move();
        System.out.println(attack);
    }
}
