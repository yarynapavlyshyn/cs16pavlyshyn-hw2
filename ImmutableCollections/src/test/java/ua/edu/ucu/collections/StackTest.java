package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPeekWithEmptyQueue() {
        Stack s = new Stack();
        s.peek();
    }
    @Test
    public void testPeek() {
        Stack q = new Stack(new Object[]{2,5,1,9});
        Object actualValue = q.peek();
        Object expValue = 9;
        assertEquals(expValue,actualValue);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDequeueWithEmptyQueue() {
        Stack q = new Stack();
        q.pop();
    }
    @Test
    public void testDequeue() {
        Stack q = new Stack(new Object[]{2,5,1,9});
        q.pop();
        Stack actualValue = q;
        Stack expValue = new Stack(new Object[]{2,5,1});
        assertEquals(expValue,actualValue);
    }
    @Test
    public void testEnqueueWithEmptyQueue() {
        Stack q = new Stack();
        q.pop(1);
        Stack actualValue = q;
        Stack expValue = new Stack(new Object[]{1});
        assertEquals(expValue,actualValue);
    }
    @Test
    public void testEnqueue() {
        Stack q = new Stack(new Object[]{2,5,1,9});
        q.pop(1);
        Stack actualValue = q;
        Stack expValue = new Stack(new Object[]{2,5,1,9,1});
        assertEquals(expValue,actualValue);
    }
    @Test
    public void testToString() {
        Stack q = new Stack(new Object[]{2,5,1,9});
        String actualValue = q.toString();
        String expValue = "[2, 5, 1, 9]";
        assertEquals(expValue,actualValue);
    }
    @Test
    public void testToStringWithEmptyStack() {
        Stack q = new Stack();
        String actualValue = q.toString();
        String expValue = "[]";
        assertEquals(expValue,actualValue);
    }
}
