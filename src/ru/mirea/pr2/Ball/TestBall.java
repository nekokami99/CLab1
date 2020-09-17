package ru.mirea.pr2.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(20, 60);
        System.out.println(b1);
        b1.move(50, 30);
        System.out.println(b1);
        Ball b2=new Ball();
        System.out.println(b2);
        b2.move(50, 30);
        b2.move(80, 40);
        System.out.println(b2);
    }
}
