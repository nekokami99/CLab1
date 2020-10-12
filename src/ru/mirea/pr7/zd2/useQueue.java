package ru.mirea.pr7.zd2;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


public class useQueue {
    public static void inputQueue(int arr[],Queue<Integer> qe){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            qe.add(arr[i]);
        }
    }
    public static void work(Queue<Integer> qe1, Queue<Integer> qe2) {
        int count=0;
        while(true){
            int a=qe1.poll();
            int b=qe2.poll();

            if(a==0&&b==9){
                qe1.add(b);
                qe1.add(a);
            }
            else if(a==9&&b==0){
                qe2.add(a);
                qe2.add(b);
            }
            else if(a>b){
                qe1.add(b);
                qe1.add(a);
            }
            else if(a<b){
                qe2.add(a);
                qe2.add(b);
            }
            count++;
            if(qe1.isEmpty()) {
                System.out.println("second " + count);
                return;
            }
            else if(qe2.isEmpty()){
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
        Queue<Integer> drunkard1 = new ArrayDeque<>();
        Queue<Integer> drunkard2 = new ArrayDeque<>();
        int[] dr1 = new int[5];
        int[] dr2 = new int[5];
        inputQueue(dr1,drunkard1);
        inputQueue(dr2,drunkard2);
        work(drunkard1,drunkard2);
    }
}
