package ua.edu.ucu.collections;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList immLinkList;

    public Queue() {
        this.immLinkList = new ImmutableLinkedList();
    }
    public Queue(Object[] c) {
        this.immLinkList = new ImmutableLinkedList(c); // just an empty immutable list
    }

    public Object peek() {
        return immLinkList.getFirst();
    }

    public Object dequeue() {
        Object toReturn = immLinkList.getFirst();
        immLinkList = immLinkList.removeFirst();
        return toReturn;
    }
    public void enqueue(Object e) {
        immLinkList = immLinkList.addLast(e);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Queue L = (Queue) obj;
        return toImmutableLinkedList().equals(L.toImmutableLinkedList());
    }
    public ImmutableLinkedList toImmutableLinkedList() {
        return new ImmutableLinkedList(immLinkList.toArray());
    }
    public String toString() {
        return immLinkList.toString();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 0; i < 10; ++i) {
            q.enqueue(i);
        }
        System.out.println("Queue of integers from 0 to 9 (created by enqueuing): "+ q);
        System.out.println("Peek: "+ q.peek());
        q.dequeue();

        System.out.println("After dequeuing: "+ q);
    }
}
