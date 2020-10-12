package ru.mirea.pr7.zd3;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class useDeque {
    public static void inputDeque(int arr[], Deque<Integer> ad){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            ad.addLast(arr[i]);
        }
    }
    public static void work(Deque<Integer> ad1, Deque<Integer> ad2){
        int count=0;
        while(true){
            int a=ad1.removeFirst();
            int b=ad2.removeFirst();

            if(a==0&&b==9){
                ad1.offerLast(b);
                ad1.offerLast(a);
            }
            else if(a==9&&b==0){
                ad2.offerLast(a);
                ad2.offerLast(b);
            }
            else if(a>b){
                ad1.offerLast(b);
                ad1.offerLast(a);
            }
            else if(a<b){
                ad2.offerLast(a);
                ad2.offerLast(b);
            }
            count++;
            if(ad1.isEmpty()) {
                System.out.println("second " + count);
                return;
            }
            else if(ad2.isEmpty()){
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
        Deque<Integer> drunkard1 = new ArrayDeque<>();
        Deque<Integer> drunkard2 = new ArrayDeque<>();
        int[] dr1 = new int[5];
        int[] dr2 = new int[5];
        inputDeque(dr1,drunkard1);
        inputDeque(dr2,drunkard2);
        work(drunkard1,drunkard2);
    }
}
