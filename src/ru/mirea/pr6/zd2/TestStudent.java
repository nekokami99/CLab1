package ru.mirea.pr6.zd2;



import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        n=scanner.nextInt();
        Student[] listStu = new Student[n];
        for(int i=0; i<n; i++) {
            System.out.println("Student " + (i+1) + ": ");
            listStu[i] = new Student();
            System.out.print("Enter student "+(i+1)+" id: ");
            listStu[i].setIdNumber(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Enter student "+(i+1)+" name: ");
            listStu[i].setName(scanner.nextLine());
            System.out.print("Enter student "+(i+1)+" GPA: ");
            listStu[i].setGPA(scanner.nextInt());

        }

        SortingStudentsByGPA sortListStu=new SortingStudentsByGPA();
        sortListStu.quickSort(listStu,0,n-1);
        sortListStu.reverse(listStu,0,n-1);
        System.out.println("Sorted students by GPA.");
        for (int i=0; i<n; i++) {
            System.out.println(listStu[i]);
        }
    }
}
