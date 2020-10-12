package ru.mirea.practice11;

public class ArrayQueue extends AbstractQueue {
    private final int capacity = 100;
    private Object array[];
    private int head;
    private int tail;

    public ArrayQueue() {
        array = new Object[capacity];
        head = tail = 0;
    }

    private void ensureCapacity(int capacity) {
        if (capacity >= array.length) {
            Object[] temp = new Object[array.length << 1];
            int count = tail < head ? array.length - head : size;
            System.arraycopy(array, head, temp, 0, count);
            if (tail < head)
                System.arraycopy(array, 0, temp, count, tail);
            array = temp;
            head = 0;
            tail = size;
        }

    }

    protected void enqueuenew(Object element) {
        ensureCapacity(size + 1);
        array[tail] = element;
        tail = (tail + 1) % array.length;
    }

    public Object elementnew() {
        return array[head];
    }

    protected void dequeuenew() {
        array[head] = null;
        head = (head + 1) % array.length;
    }

    protected void pushnew(Object element) {
        ensureCapacity(size + 1);
        head = (this.head - 1 >= 0) ? array.length - 1 : head - 1;
        array[head] = element;
    }

    protected Object peeknew() {
        return array[(tail == 0) ? array.length - 1 : tail - 1];
    }

    protected void removenew() {
        tail = tail == 0 ? array.length - 1 : --tail;
        array[tail] = null;
    }
}