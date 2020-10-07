package ru.mirea.pr6.zd3;

public class MergeSort {
    public static void merge2List(Student[] list, Student[] list1, int n1, Student[] list2, int n2) {
        int n = n1 + n2;
        for(int i=0; i<n; i++) {
            if(i < n1) {
                list[i] = list1[i];
            }
            else
                list[i] = list2[i-n1];
        }
    }
    public static void merge(Student[] list, int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (i = 0; i < n1; i++)
            L[i] = list[l + i];
        for (j = 0; j < n2; j++)
            R[j] = list[m + 1+ j];

        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (L[i].getIdNumber() <= R[j].getIdNumber()) {
                list[k] = L[i];
                i++;
            }
            else {
                list[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            list[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            list[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(Student[] list, int l, int r) {
        if (l < r) {
            int m = l+(r-l)/2;
            mergeSort(list, l, m);
            mergeSort(list, m+1, r);
            merge(list, l, m, r);
        }
    }
}
