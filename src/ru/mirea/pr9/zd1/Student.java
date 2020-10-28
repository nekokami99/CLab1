package ru.mirea.pr9.zd1;

public class Student implements Comparable {
    private int idNumber;
    private String name;
    private float GPA;

    public Student() {
    }

    public Student(int idNumber, String name, float GPA) {
        this.idNumber = idNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student {" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
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
