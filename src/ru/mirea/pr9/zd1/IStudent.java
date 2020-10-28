package ru.mirea.pr9.zd1;

public interface IStudent {
    void quickSort(Student[] arr, int left, int right);
    Student search(Student[] arr, String name) throws StudentNotFoundException;
}
