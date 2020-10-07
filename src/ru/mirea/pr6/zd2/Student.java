package ru.mirea.pr6.zd2;

public class Student implements Comparable{
    private int idNumber;
    private String name;
    private float GPA;

    public Student() {
    }

    public Student(String name, int idNumber, float GPA) {
        this.name = name;
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student" +
                " idNumber " + idNumber +
                ", name " + name  +
                ", GPA " + GPA ;
    }

    @Override
    public int compareTo(Object o) {
        Student st = (Student)o;
        if (this.getGPA() > st.getGPA()) {
            return 1;
        }
        if (this.getGPA() < st.getGPA()) {
            return -1;
        }
        return 0;
    }
}
