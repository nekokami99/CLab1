package ru.mirea.pr8;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        // create collection
        Collection<String> listStr= Arrays.asList("BMW","Lamborgini","Ferrari","Audi","Mercedes","Toyota");

        // test WaitList
        testWaitList(listStr);

        // test UnfairWaitList
        testUnfairWaitList(listStr);

        // test BoundedWaitList
        testBoundedWaitList(listStr);

    }
    public static void testWaitList(Collection c){
        // create WaitList
        WaitList<String> testStr=new WaitList<String>(c);

        // test methods and show results
        System.out.println("Check testWaitList");
        System.out.print("List: ");
        System.out.println(testStr.toString());
        testStr.add("Mustang");
        System.out.print("List after add Mustang: ");
        System.out.println(testStr.toString());
        testStr.remove();
        System.out.print("List after remove one element on top: ");
        System.out.println(testStr.toString());
        System.out.println("List contains Chevrolet: " + testStr.contains("Chevrolet"));
        System.out.println("List contains " + c.toString() + ": " + testStr.containsAll(c));
        System.out.println("List is empty: " + testStr.isEmpty());
    }
    public static void testBoundedWaitList(Collection c){
        // create UnfairWaitList
        BoundedWaitList<String> testStr = new BoundedWaitList<String>(c.size());

        // add elements for testStr's content
        Iterator<String> iterator = c.iterator();
        while(iterator.hasNext()){
            testStr.content.add(iterator.next());
        }

        // test methods of BoundedWaitList and show results
        System.out.println("Check testBoundedWaitList");
        System.out.print("List: ");
        System.out.println(testStr.toString());
        System.out.println("Capacity: " + testStr.getCapacity());
        testStr.add("Ford");
        System.out.println("List after add Ford to back: " + testStr.toString());

        // test methods of WaitList (superclass) and show results
        System.out.println("List contains BMW : " + testStr.contains("BMW"));
        System.out.println("List contains " + c.toString() + ": " + testStr.containsAll(c));
        System.out.println("List is empty: " + testStr.isEmpty());
    }
    public static void testUnfairWaitList(Collection c){
        // create UnfairWaitList
        UnfairWaitList<String> testStr = new UnfairWaitList<String>();

        // add elements for testStr's content
        Iterator<String> iterator = c.iterator();
        while(iterator.hasNext()){
            testStr.content.add(iterator.next());
        }

        // test methods of UnfairWaitList and show results
        System.out.println("Check testUnfairWaitList");
        System.out.print("List: ");
        System.out.println(testStr.toString());
        testStr.remove("Ferrari");
        System.out.println("List after remove 'Ferrari': " + testStr.toString());
        testStr.moveToBack("BMW");
        System.out.println("List after move 'BMW' to back: " + testStr.toString());

        // test methods of WaitList (superclass) and show results
        System.out.println("List contains 'Chevrolet': " + testStr.contains("Chevrolet"));
        System.out.println("List contains " + c.toString() + ": " + testStr.containsAll(c));
        System.out.println("List is empty: " + testStr.isEmpty());
    }
}
