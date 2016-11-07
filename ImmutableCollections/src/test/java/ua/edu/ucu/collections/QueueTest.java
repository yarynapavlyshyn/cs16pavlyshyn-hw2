package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testPeekWithEmptyQueue() {
        Queue q = new Queue();
        q.peek();
    }
    @Test
    public void testPeek() {
        Queue q = new Queue(new Object[]{2,5,1,9});
        Object actualValue = q.peek();
        Object expValue = 2;
        assertEquals(expValue,actualValue);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDequeueWithEmptyQueue() {
        Queue q = new Queue();
        q.dequeue();
    }
    @Test
    public void testDequeue() {
        Queue q = new Queue(new Object[]{2,5,1,9});
        q.dequeue();
        Queue actualValue = q;
        Queue expValue = new Queue(new Object[]{5,1,9});
        assertEquals(expValue,actualValue);
    }
    @Test
    public void testEnqueueWithEmptyQueue() {
        Queue q = new Queue();
        q.enqueue(1);
        Queue actualValue = q;
        Queue expValue = new Queue(new Object[]{1});
        assertEquals(expValue,actualValue);
    }
    @Test
    public void testEnqueue() {
        Queue q = new Queue(new Object[]{2,5,1,9});
        q.enqueue(1);
        Queue actualValue = q;
        Queue expValue = new Queue(new Object[]{2,5,1,9,1});
        assertEquals(expValue,actualValue);
    }
    @Test
    public void testToString() {
        Queue q = new Queue(new Object[]{2,5,1,9});
        String actualValue = q.toString();
        String expValue = "[2, 5, 1, 9]";
        assertEquals(expValue,actualValue);
    }
    @Test
    public void testToStringWithEmptyQueue() {
        Queue q = new Queue();
        String actualValue = q.toString();
        String expValue = "[]";
        assertEquals(expValue,actualValue);
    }
}
