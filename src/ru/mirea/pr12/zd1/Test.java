package ru.mirea.pr12.zd1;

public class Test {
    public static void main(String[] args) {
        Person p1=new Person("Nguyen","Xuan","Bach");
        Person p2=new Person("Vu","","Xuan");
        Person p3=new Person("Le","Cuong","");
        Person p4=new Person("Cao");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
