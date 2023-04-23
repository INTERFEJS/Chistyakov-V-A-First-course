package lab2;

import java.util.function.Predicate;

public class ILinkedList implements IList {

    private static class Node {
        int value;
        Node next;
        Node prev;
    }

    private int size;

    private Node head;
    private Node tail;

    @Override
    public void add(int value) {

    }

    @Override
    public void add(int idx, int value) {

    }

    @Override
    public void remove(int idx) {

    }

    @Override
    public void remove(Predicate<Integer> condition) {

    }

    @Override
    public int get(int idx) {
        return 0;
    }

    @Override
    public String toString() {
        return "ILinkedList{}";
    }
}
