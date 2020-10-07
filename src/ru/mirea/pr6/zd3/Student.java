package ru.mirea.pr6.zd3;



public class Student {
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
}