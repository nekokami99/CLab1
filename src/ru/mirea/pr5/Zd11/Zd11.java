package ru.mirea.pr5.Zd11;

import java.util.Scanner;

public class Zd11 {
    public static int recursion(){
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        if(a==1)
            return recursion()+1;
        else if(a==0){
            int b = scanner.nextInt();
            if(b==0)
                return 0;
            else if(b==1){
                return recursion()+1;
            }
        }
        return recursion();
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
