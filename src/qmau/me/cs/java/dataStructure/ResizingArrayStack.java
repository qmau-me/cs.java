package qmau.me.cs.java.dataStructure;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    public class ReverseArrayIterator implements Iterator<Item> {
        private int i = size;

        public boolean hasNext() {
            return i > 0;
        }

        public void remove() {}

        public Item next() {
            return s[--i];
        }
    }



    private Item[] s;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public ResizingArrayStack(int capacity) {
        s = (Item[]) new Object[capacity];
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void push(Item item) {
        if (size == s.length) {
            resize(2 * s.length);
        }
        s[size++] = item;
    }

    public Item pop() {
        Item item = s[size - 1];
        size--;
        if (size > 0 && size == s.length / 4)
            resize(s.length / 2);
        return item;
    }

    public void resize(int capacity) {
        @SuppressWarnings("unchecked")
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }

}

