package ru.mirea.pr6.zd3;



import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        int n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students of list 1: ");
        n1 = scanner.nextInt();
        System.out.print("Enter number of students of list 2: ");
        n2 = scanner.nextInt();
        Student[] listStu1 = new Student[n1];
        Student[] listStu2 = new Student[n2];
        Student[] listStu = new Student[n1+n2];

        System.out.println("Enter students of list 1: ");
        for (int i = 0; i < n1; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            listStu1[i] = new Student();
            System.out.print("Enter student " + (i + 1) + " id: ");
            listStu1[i].setIdNumber(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Enter student " + (i + 1) + " name: ");
            listStu1[i].setName(scanner.nextLine());
            System.out.print("Enter student " + (i + 1) + " GPA: ");
            listStu1[i].setGPA(scanner.nextInt());
        }
        System.out.println("Enter students of list 2: ");
        for (int i = 0; i < n2; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            listStu2[i] = new Student();
            System.out.print("Enter student " + (i + 1) + " id: ");
            listStu2[i].setIdNumber(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Enter student " + (i + 1) + " name: ");
            listStu2[i].setName(scanner.nextLine());
            System.out.print("Enter student " + (i + 1) + " GPA: ");
            listStu2[i].setGPA(scanner.nextInt());
        }
        MergeSort mer = new MergeSort();
        mer.merge2List(listStu, listStu1, n1, listStu2, n2);
        mer.mergeSort(listStu, 0, n1 + n2 - 1 );

        System.out.println("Sorted students by IdNumber.");
        for (int i=0; i<(n1+n2); i++) {
            System.out.println(listStu[i]);
        }
    }
}
