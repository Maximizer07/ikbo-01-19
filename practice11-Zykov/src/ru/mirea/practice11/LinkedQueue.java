package ru.mirea.practice11;

public class LinkedQueue extends AbstractQueue {
    private Node head;
    private Node tail;

    protected void enqueuenew(Object element) {
        tail = new Node(element, null, tail);
        if (head == null)
            head = tail;
        else
            tail.next.prev = tail;
    }

    protected Object elementnew() {
        return head.value;
    }

    protected void dequeuenew() {
        if (head.prev != null) head.prev.next = null;
        head = head.prev;

    }

    protected void pushnew(Object element) {
        head = new Node(element, head, null);
        if (tail == null) {
            tail = head;
        } else
            head.prev.next = head;
    }

    protected Object peeknew() {
        return tail.value;
    }

    protected void removenew() {
        tail = tail.next;
        if (tail != null) {
            tail.prev = null;
        }
    }

    private class Node {
        Object value;
        Node prev;
        Node next;

        Node(Object element, Node prev, Node next) {
            value = element;
            this.prev = prev;
            this.next = next;
        }
    }


}