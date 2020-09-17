package ru.mirea.pr1.Book;

public class TestBook {
    public static void main(String[] arg){
        Book b1=new Book("The fault in our stars","John Green",2012);
        Book b2=new Book("Harry Porter and the Order of the Phoenix","J.K Rowling",2003);
        Book b3=new Book("The call of the wild","Jack London",1992);
        Book b4=new Book("War and peace");
        Book b5=new Book("Eragon","Christopher Paolini");
        b4.setAuthor("Lev Tolstoy");
        b4.setYearPublish(1990);
        b5.setYearPublish(2006);
        System.out.println(b1);
        System.out.println(b3);
        System.out.println(b5);
        b3.bookStatus();
        b5.bookStatus();
    }
}
