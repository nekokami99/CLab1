package ru.mirea.pr5.Zd10;

public class Zd10{
    public static int recursion(int n){
        int a=n%10;
        int p= (int) Math.log10(n);
        if(n==0)
            return 0;
        return (int) (a*Math.pow(10,p)+recursion(n/10));
    }

    public static void main(String[] args) {
        System.out.println(recursion(238947));
    }
}