package ru.mirea.pr5.Zd12;

import java.util.Scanner;

public class Zd12 {
    public static void recursion() {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        if(a==0)
            return ;
        else if(a%2!=0)
            System.out.println(a);
        recursion();
    }

    public static void main(String[] args) {
        recursion();
    }
}
