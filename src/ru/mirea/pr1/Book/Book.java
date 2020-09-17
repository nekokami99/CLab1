package ru.mirea.pr1.Book;

public class Book {
    private String name;
    private String author;
    private int yearPublish;

    public Book(String n, String a, int yP){
        name=n;
        author=a;
        yearPublish=yP;
    }
    public Book(String n,String a){
        name=n;
        author=a;
        yearPublish=0;
    }
    public Book(String n){
        name=n;
        author="unknown";
        yearPublish=0;
    }

    public void setName(String n){
        this.name=n;
    }
    public void setAuthor(String a){
        this.author=a;
    }
    public void setYearPublish(int yP){
        this.yearPublish=yP;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearPublish(){
        return yearPublish;
    }

    public String toString(){
        return "This book name: "+name+" was published in "+yearPublish+" by "+author+".";
    }
    public void bookStatus() {
        if (yearPublish > 2000)
            System.out.println("Book " + name + " is in good condition");
        else
            System.out.println(("Book "+name+" is old and need to be reprinted"));
    }
}
