package ru.mirea.pr9.zd1;





import java.util.Scanner;

public class Test {
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

        SortGPAAndFindStudentByName sortListStu=new SortGPAAndFindStudentByName();
        sortListStu.quickSort(listStu,0,n-1);
        sortListStu.reverse(listStu,0,n-1);
        System.out.println("--------------------Sorted students by GPA--------------------");
        for (int i=0; i<n; i++) {
            System.out.println(listStu[i]);
        }

        SortGPAAndFindStudentByName findStu=new SortGPAAndFindStudentByName();
        System.out.println("--------------------Find student by name--------------------");

        while(true) {
            System.out.print("Enter the name for search: ");
            String name = scanner.next();
            try {
                System.out.println(findStu.search(listStu, name).toString());
            } catch (StudentNotFoundException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Continue? Y/N: ");
            char x = scanner.next().charAt(0);
            if(x=='n'||x=='N')
                return;
        }
    }
}
