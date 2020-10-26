package ru.mirea.pr8;

public class UnfairWaitList<E> extends WaitList<E>{
    //constructor
    public UnfairWaitList() {
    }

    // methods
    public void remove(E element){
        if(super.contains(element)){
            this.content.remove(element);
        }
        else
            System.out.println("\n There is no "+element+" in this list to delete.");
    }

    // find in list, if the list has element and that element is
    // not in the last position in list then move it to the last
    public void moveToBack(E element){
        if(super.contains(element)){
            this.remove(element);
            this.content.add(element);
        }
        else
            System.out.println("\n There is no "+element+" in this list to delete.");
    }
}
