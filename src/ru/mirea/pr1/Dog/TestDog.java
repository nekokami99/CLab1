package ru.mirea.pr1.Dog;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2,"Bulldog");
        Dog d2 = new Dog("Jun", 7,"Shiba");
        Dog d3 = new Dog("Chihuahua");
        d3.setAge(1);
        d3.setName("Gin");
        System.out.println(d1);
        d1.getPrice();
        d2.getPrice();
        d3.getPrice();
    }
}

