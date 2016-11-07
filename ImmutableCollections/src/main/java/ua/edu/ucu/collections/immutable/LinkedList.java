package ua.edu.ucu.collections.immutable;

import java.util.Objects;

/**
 * Created by cs.ucu.edu.ua on 11/3/2016.
 */
public class LinkedList {
    private int size;
    private Node head, tail;

    private class Node {
        public Object item;
        public Node next;

        public Node(Object item) {
            this.item = item;
            this.next = null;
        }
        public Node(Object item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    public LinkedList() {
        head = tail = null;
        size = 0;
    }
    public LinkedList(Object[] c) {
        for (Object o: c) {
            add(o);
        }
    }
    public void add(Object e) { // mutable
        this.add(size, e);
    }
    public void add(int index, Object e) {
        if (0 > index || index > size) {throw new IndexOutOfBoundsException();}

        Node toInsert = new Node(e);

        if (index == 0) {
            toInsert.next = head;
            head = toInsert;
            if (size == 0)
                tail = toInsert;
        } else if (index == size) {
            tail.next = toInsert;
            tail = toInsert;

        } else {
            Node n = head;
            for (int i = 0; i < index - 1; ++i) // move to the (index - 1) element
                n = n.next;
            toInsert.next = n.next.next;
            n.next = toInsert;
        }
        ++size;
    }
    public void addAll(Object[] c) {
        addAll(size, c);
    }

    public void addAll(int index, Object[] c) {
        if (0 > index || index > size) {throw new IndexOutOfBoundsException();}
        for (Object o: c) {
            add(index, o);
            ++index;
        }
    }
    public Object get(int index) {
        return getNode(index).item;
    }

    private Node getNode(int index) {
        if (0 > index || index >= size) {throw new IndexOutOfBoundsException();}
        Node n = head;
        for (int i = 0; i != index; ++i) {
            n = n.next;
        }
        return n;
    }
    public void remove(int index) {
        if (index >= size) {throw new IndexOutOfBoundsException();}
        if (index == 0) {
            head = head.next;
            --size;
            return;
        }
        Node beforeNodeToRemove = getNode(index - 1);
        beforeNodeToRemove.next = beforeNodeToRemove.next.next;
        --size;
    }
    public void delete() {
        remove(size() - 1);
    }

    public void set(int index, Object e) {
        getNode(index).item = e;
    }

    public int indexOf(Object e) {
        Node n = head;
        for (int i = 0; i < size; ++i) {
            if (n.item == e)
                return i;
            n = n.next;
        }
        return -1;
    }
    public int size() {
        return size;
    }
    public void clear() {
        head = tail = null;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public Object[] toArray() {
        Object[] arr = new Object[size];
        Node n = head;
        for (int i = 0; i < size; ++i) {
            arr[i] = n.item;
            n = n.next;
        }
        return arr;
    }
    public LinkedList copy() {
        LinkedList l = new LinkedList();
        for (int i = 0; i < size(); ++i) {
            l.add(get(i));
        }
        return l;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LinkedList L = (LinkedList) obj;
        if (size() != L.size())
            return false;
        for (int i = 0; i < size(); ++i) {
            if (this.get(i).equals(L.get(i)) == false)
                return false;
        }
        return true;
    }
    public String toString() {
        if (size == 0)
            return "[]";
        String toReturn = "[" + head.item;
        Node n = head.next;
        while (n != null) {
            toReturn += ", " + n.item;
            n = n.next;
        }
        toReturn += "]";
        return toReturn;
    }
}
