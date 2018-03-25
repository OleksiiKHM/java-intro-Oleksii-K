package Lesson03Interface;

public class Attack_Impl implements Attack_Interface {
    private String move;
    private String attack;

    public Attack_Impl(String move, String attack){
        this.move = move;
        this.attack = attack;
    }

    @Override
    public void move() {
        System.out.println(move);
    }

    @Override
    public void attack() {
        System.out.println(move);
        System.out.println(attack);

    }

}
