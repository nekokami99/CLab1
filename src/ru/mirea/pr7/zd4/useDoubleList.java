package ru.mirea.pr7.zd4;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;


public class useDoubleList {
    public static void inputList(double arr[], ArrayList<Double> dl){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            dl.add(arr[i]);
        }
    }
    public static void work(ArrayList<Double> dl1,ArrayList<Double> dl2){
        int count=0;
        while(true){
            double a=dl1.get(0);
            double b=dl2.get(0);
            dl1.remove(0);
            dl2.remove(0);

            if(a==0&&b==9){
                dl1.add(b);
                dl1.add(a);
            }
            else if(a==9&&b==0){
                dl2.add(a);
                dl2.add(b);
            }
            else if(a>b){
                dl1.add(b);
                dl1.add(a);
            }
            else if(a<b){
                dl2.add(a);
                dl2.add(b);
            }
            count++;
            if(dl1.isEmpty()) {
                System.out.println("second " + count);
                return;
            }
            else if(dl2.isEmpty()){
                System.out.println("first " + count);
                return;
            }
            else if(count>106) {
                System.out.println("botva");
                return;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Double> drunkard1 = new ArrayList<>();
        ArrayList<Double> drunkard2 = new ArrayList<>();
        double[] dr1 = new double[5];
        double[] dr2 = new double[5];
        inputList(dr1,drunkard1);
        inputList(dr2,drunkard2);
        work(drunkard1,drunkard2);
    }
}
