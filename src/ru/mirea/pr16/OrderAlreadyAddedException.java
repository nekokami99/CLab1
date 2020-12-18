package ru.mirea.pr16;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String message){
        super(message);
    }
}