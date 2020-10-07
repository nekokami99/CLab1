package ru.mirea.pr6.zd1;

public class SortByID {
    public void InsertionSort(Student[] student){
        for(int i=0; i<student.length; i++) {
            Student temp  = student[i];
            int x = student[i].getIDNumber();
            int y = i;
            while (y > 0 && student[y-1].getIDNumber() > x) {
                student[y] = student[y-1];
                y--;
            }
            student[y] = temp;
        }
    }
}
