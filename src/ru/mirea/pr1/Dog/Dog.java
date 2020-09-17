package ru.mirea.pr1.Dog;

public class Dog {
    private String name;
    private int age;
    private String type;

    public Dog(String n,int a,String t){
        name=n;
        age=a;
        type=t;
    }
    public Dog(String n,int a){
        name=n;
        age=a;
        type="unknown";
    }
    public Dog(String t){
        type=t;
        name="new dog";
        age=0;
    }

    public void setName(String n){
        this.name=n;
    }
    public void setAge(int a){
        this.age=a;
    }
    public void setType(String t){
        this.type=t;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getType(){
        return type;
    }

    public String toString(){
        return "This id the "+this.type+" dog, it's "+this.age+" years old, name "+this.name+".";
    }
    public void getPrice(){
        int p;
        p = (age < 7) ? 200 : 100;
        System.out.println(name+"'s price is "+p+" dollars.");
    }
}
