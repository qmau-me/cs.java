package me.qmau.cs.java.dataStructure;

public class ResizingArrayQueue<Item> {

    private Item[] q;
    private int head;
    private int tail;
    private int size;

    // create an empty queue
    @SuppressWarnings("unchecked")
    public ResizingArrayQueue() {
        q = (Item[]) new Object[2];
        head = 0;
        tail = 0;
        size = 0;
    }

    // size of the queue
    public int size() {
        return size;
    }

    // insert a new string
    public void enqueue(Item item) {
        if (size == q.length)
            resize(size * 2);
        q[tail++] = item;
        if (tail == q.length)
            tail = 0;
        size++;
    }

    public Item dequeue() {
        Item item = q[head];
        q[head] = null;
        size--;
        head++;
        if (head == q.length) {
            head = 0;
        }
        if (size > 0 && size < q.length / 4) {
            resize(q.length / 2);
        }
        return item;
    }

    public void resize(int capacity) {
        @SuppressWarnings("unchecked")
        Item[] temp = (Item[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = q[i];
        }
        q = temp;
        head = 0;
        tail = size;
    }

    // is the queue empty?
    public boolean isEmpty() {
        return tail == 0;
    }

    // main function
    public static void main(String args[]) {
        ResizingArrayQueue<String> queue = new ResizingArrayQueue<String>();
        queue.enqueue("a");
        queue.enqueue("a");
        queue.enqueue("a");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }

}

