package ru.mirea.pr8;

public class BoundedWaitList<E> extends WaitList<E>{
    //field
    private int capacity;

    //constructor
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    //method
    public int getCapacity(){
        return this.capacity;
    }

    public void add(Object element){
        super.add(element);
    }

    // return String that represents for class
    @Override
    public String toString() {
        return super.toString();
    }
}
