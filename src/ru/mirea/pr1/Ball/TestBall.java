package ru.mirea.pr1.Ball;

public class TestBall {
    public static void main(String[] args){
        Ball b1=new Ball(11,"soccer ball",100,"Adidas");
        Ball b2=new Ball(10.6,"basketball",65,"Nike");
        Ball b3=new Ball(3.4,"tennis ball",10,"Wilson");
        Ball b4=new Ball("Mikasa","volleyball");
        Ball b5=new Ball("Nike","soccer ball");
        b4.setRadius(10.5);
        b5.setPrice(110);
        System.out.println(b1);
        System.out.println(b2);
        b2.showPrice();
        b5.sizeOfBall();
        b3.sizeOfBall();
    }
}
