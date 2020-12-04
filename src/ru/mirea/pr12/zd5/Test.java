package ru.mirea.pr12.zd5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        s=scan.nextLine();
        System.out.println(MatchWord.getLine(s));
    }
}
