package ru.mirea.pr6.zd2;

public class SortingStudentsByGPA {
    //Quick Sort
    public static void quickSort(Student[] listStu, int left, int right) {
        if (listStu == null || listStu.length == 0)
            return;
        if (left >= right)
            return;
        int middle = left + (right - left) / 2;
        Student pivot = listStu[middle];
        int i = left, j = right;
        while (i <= j) {
            while (listStu[i].compareTo(pivot) < 0) {
                i++;
            }
            while (listStu[j].compareTo(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = listStu[i];
                listStu[i] = listStu[j];
                listStu[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(listStu, left, j);

        if (right > i)
            quickSort(listStu, i, right);
    }
    public static void reverse(Student[] listStu, int i, int j) {
        while(i<j)
        {
            Student temp = listStu[i];
            listStu[i] = listStu[j];
            listStu[j] = temp;
            i++;
            j--;
        }
    }

}