package ua.edu.ucu.collections;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList immLinkList;

    public Stack () {
        this.immLinkList = new ImmutableLinkedList(); // just an empty immutable list
    }

    public Stack(Object[] c) {
        this.immLinkList = new ImmutableLinkedList(c);
    }
    public Object peek() {
        return immLinkList.getLast();
    }

    public Object pop() {
        Object toReturn = immLinkList.getLast();
        immLinkList = immLinkList.removeLast();
        return toReturn;
    }
    public void pop(Object e) {
        immLinkList = immLinkList.addLast(e);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Stack L = (Stack) obj;
        return toImmutableLinkedList().equals(L.toImmutableLinkedList());
    }
    public ImmutableLinkedList toImmutableLinkedList() {
        return new ImmutableLinkedList(immLinkList.toArray());
    }
    public String toString() {
        return immLinkList.toString();
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        for (int i = 0; i < 10; ++i) {
            s.pop(i);
        }
        System.out.println("Stack of integers from 0 to 9 (created by popping the elements): "+ s);
        System.out.println("Peek: "+ s.peek());
        s.pop();

        System.out.println("After poping: "+ s);
        System.out.println("Peek: "+ s.peek());
    }
}
