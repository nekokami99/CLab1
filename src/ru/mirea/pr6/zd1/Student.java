package ru.mirea.pr6.zd1;

public class Student{
    private int IDNumber;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age, int IDNumber) {
        this.name = name;
        this.age = age;
        this.IDNumber = IDNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    @Override
    public String toString() {
        return "Student" +
                "IDNumber: " + IDNumber +
                ", name: " + name +
                ", age: " + age ;
    }
}


