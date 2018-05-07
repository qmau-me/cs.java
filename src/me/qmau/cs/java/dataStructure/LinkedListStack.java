package me.qmau.cs.java.dataStructure;

import java.util.Iterator;

public class LinkedListStack<Item> implements Iterable<Item> {

    private Node first = null;

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {

        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        return item;
    }

    public static void main(String[] args) {
        LinkedListStack<String> stack = new LinkedListStack<String>();
        System.out.println(stack.isEmpty());
        stack.push("a");
        stack.push("b");
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }

}
