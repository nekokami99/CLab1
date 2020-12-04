package ru.mirea.pr12.zd2;



public class Test {
    public static void main(String[] args) {
        Address a1=new Address("Russia ,  Moscow , Moscow, Pervomanskaya, 36, 2, 1209",true);
        Address a2=new Address("Vietnam, HaNoi; HaDong. VanPhu, 5, 3, 234",false);
        Address a3=new Address("  Russia ,   Moscow , Moscow,  Pokryshkina  , 1, 1, 34  ",true);
        Address a4=new Address("Russia; Moscow, Moscow, Bolshaya Semyonovskaya. 16. 3, 45",false);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
