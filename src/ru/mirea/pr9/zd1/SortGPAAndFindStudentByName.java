package ru.mirea.pr9.zd1;

public class SortGPAAndFindStudentByName implements IStudent {
    @Override
    public void quickSort(Student[] listStu, int left, int right) {
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
    @Override
    public Student search(Student[] listStu, String name) throws StudentNotFoundException {
        for(int i=0; i<listStu.length; i++) {
            if(listStu[i].getName().equals(name))
                return listStu[i];
        }
        throw new StudentNotFoundException( "Student "+name + " does not exist in the list");
    }
}
