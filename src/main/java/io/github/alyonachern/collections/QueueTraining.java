package io.github.alyonachern.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;


public class QueueTraining {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Fish");
        deque.add("Hamster");
        deque.addFirst("Dog");
        deque.addLast("Cat");
        System.out.println("The First element is "+ deque.getFirst() + " and the Last one is " + deque.getLast());
        deque.pop();
        deque.peekLast();
        deque.push("Snake");

        Iterator iterator = deque.iterator();
        while(iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }
    }
}
