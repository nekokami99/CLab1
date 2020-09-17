package ru.mirea.pr1.Ball;
import java.lang.*;
public class Ball {
    private double radius;
    private String ballType;
    private int price;
    private String brand;

    public Ball(double r, String bT,int p,String b){
        radius=r;
        ballType=bT;
        price=p;
        brand=b;
    }
    public Ball(String b, String bT){
        ballType=bT;
        brand=b;
        radius=0;
        price=0;
    }

    public void setRadius(double r){
        this.radius=r;
    }
    public void setPrice(int p){
        this.price=p;
    }
    public double getRadius(){
        return radius;
    }
    public int getPrice(){
        return price;
    }
    public String getBallType(){
        return ballType;
    }
    public String getBrand(){
        return brand;
    }

    public String toString(){
        return "This is the "+ballType+" of "+ brand+" cost "+ price+'.';
    }

    public void sizeOfBall(){
        double v;
        v=4/3*(Math.PI)*Math.pow(radius,3);
        if(radius==0)
            System.out.println("Ball size hasn't been update yet");
        else
            System.out.println("Volume of the "+brand+" "+ballType+" is: "+v+".");
    }
    public void showPrice(){
        if(price==0)
            System.out.println("This "+brand+" "+ballType+" hasn't been update price yet");
        else
            System.out.println("This "+brand+" "+ballType+" price is "+price+" dollars.");
    }
}
