package ru.mirea.pr2.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1= new Author("Bach","nxb17111999@gmai;.com",'m');
        Author a2= new Author("Simon","simonpyke@opg.vn",'m');
        Author a3= new Author("Jane","janemorrison@gmail,com",'f');
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a2.getName());
        a3.setEmail("daucatmoi@occho.pp");
        System.out.println(a3);
    }
}
