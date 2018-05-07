package me.qmau.cs.java.dataStructure;

public class LinkedListQueue<Item> {

    private Node first;
    private Node last;
    private int size;

    public class Node {
        Item item;
        Node next;
    }

    // create an empty queue
    public LinkedListQueue() {
        first = null;
        last = null;
        size = 0;
    }

    // size of the queue
    public int size() {
        return size;
    }

    // insert a new string
    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        size++;
    }

    // remove and return the string
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        size--;
        return item;
    }

    // is the queue empty?
    public boolean isEmpty() {
        return first == null;
    }

    // main function
    public static void main(String args[]) {
        LinkedListQueue<String> queue = new LinkedListQueue<String>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("d");
        queue.dequeue();
        queue.dequeue();
    }

}

