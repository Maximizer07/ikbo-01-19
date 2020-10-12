package ru.mirea.practice11;

public abstract class AbstractQueue implements Queue {
    protected int size = 0;
    protected abstract void enqueuenew(Object element);
    protected abstract Object elementnew();
    protected abstract void dequeuenew();
    protected abstract void pushnew(Object element);
    protected abstract Object peeknew();
    protected abstract void removenew();
    public void enqueue(Object element) {
        assert element != null;
        enqueuenew(element);
        size++;
    }

    public Object element() {
        assert size > 0;
        return elementnew();
    }

    public Object dequeue() {
        assert size > 0;
        Object result = elementnew();
        dequeuenew();
        --size;
        return result;
    }

    public void push(Object element) {
        System.out.println("Push");
        assert element != null;
        pushnew(element);
        size++;
    }

    public Object peek() {
        assert size > 0;
        return peeknew();
    }

    public Object remove() {
        assert size > 0;
        Object result = peek();
        removenew();
        --size;
        return result;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    public Object[] toArray() {
        Object[] newArray = new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = dequeue();
            enqueue(newArray[i]);
        }
        return newArray;
    }
}
