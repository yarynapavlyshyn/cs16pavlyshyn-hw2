package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    @Test
    public void testAddFirstToEmptyList() {
        ImmutableLinkedList L = new ImmutableLinkedList();
        ImmutableLinkedList actualResult = L.addFirst(1);
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{1});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testAddFirst() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0,1,2,3,4,5});
        L.addFirst(-1);
        ImmutableLinkedList actualResult = L;
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{0,1,2,3,4,5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testAddFirstReturnValue() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0,1,2,3,4,5});
        ImmutableLinkedList actualResult = L.addFirst(-1);
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{-1,0,1,2,3,4,5});
        assertEquals(expResult, actualResult);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFirstWithEmptyList() {
        LinkedList l = new LinkedList();
        ImmutableLinkedList L = new ImmutableLinkedList(l);
        L.getFirst();
    }
    @Test
    public void testGetFirst() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{8, 1, 2, 3, 4, 5});
        L.getFirst();
        Object actualResult = L.getFirst();
        int expResult = 8;
        assertEquals(expResult, actualResult);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetLastWithEmptyList() {
        ImmutableLinkedList L = new ImmutableLinkedList();
        L.getLast();
    }
    @Test
    public void testGetLast() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{1, 2, 3, 4, 5});
        Object actualResult = L.getLast();
        int expResult = 5;
        assertEquals(expResult, actualResult);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveWithEmptyList() {
        ImmutableLinkedList L = new ImmutableLinkedList();
        L.removeFirst();
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveFirstWithEmptyList() {
        ImmutableLinkedList L = new ImmutableLinkedList();
        L.removeFirst();
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveLastWithEmptyList() {
        ImmutableLinkedList L = new ImmutableLinkedList();
        L.removeLast();
    }
    @Test
    public void testRemove() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0,1,2,3,4,5});
        L.remove(3);
        ImmutableLinkedList actualResult = L;
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{0,1,2,3,4,5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testRemoveReturnValue() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0,1,2,3,4,5});
        ImmutableLinkedList actualResult = L.remove(3);
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{0,1,2,4,5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testRemoveFirstReturnValue() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0, 1, 2, 3, 4, 5});
        ImmutableLinkedList actualResult = L.removeFirst();
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{1, 2, 3, 4, 5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testRemoveLastReturnValue() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0, 1, 2, 3, 4, 5});
        ImmutableLinkedList actualResult = L.removeLast();
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{0, 1, 2, 3, 4});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testRemoveFirst() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0, 1, 2, 3, 4, 5});
        L.removeFirst();
        ImmutableLinkedList actualResult = L;
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{0, 1, 2, 3, 4, 5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testRemoveLast() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0, 1, 2, 3, 4, 5});
        ImmutableLinkedList actualResult = L;
        L.removeLast();
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{0, 1, 2, 3, 4, 5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testRemoveFirstREturnValue() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0, 1, 2, 3, 4, 5});
        ImmutableLinkedList actualResult = L.removeFirst();
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{1, 2, 3, 4, 5});
        assertEquals(expResult, actualResult);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetWithEmptyList() {
        ImmutableLinkedList L = new ImmutableLinkedList();
        L.set(0,5);
    }
    @Test
    public void testSet() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0, 1, 2, 3, 4, 5});
        ImmutableLinkedList actualResult = L;
        L.set(3,7);
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{0, 1, 2, 3, 4, 5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testSetReturnValue() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0, 1, 2, 3, 4, 5});
        ImmutableLinkedList actualResult = L.set(2,10);
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{0, 1, 10, 3, 4, 5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testIndexOf() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0, 1, ":)", 3, 4, 5});
        int actualResult = L.indexOf(":)");
        int expResult = 2;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testIndexOfWithoutSuchElement() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{0, 1, ":)", 3, 4, 5});
        int actualResult = L.indexOf(":(");
        int expResult = -1;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testIndexOfWithEmptyList() {
        ImmutableLinkedList L = new ImmutableLinkedList();
        int actualResult = L.indexOf("any element");
        int expResult = -1;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testSizeWithEmptyList() {
        ImmutableLinkedList L = new ImmutableLinkedList();
        int actualResult = L.size();
        int expResult = 0;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testSize() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{1,3,5});
        int actualResult = L.size();
        int expResult = 3;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testIsEmptyWithEmptyList() {
        ImmutableLinkedList L = new ImmutableLinkedList();
        boolean actualResult = L.isEmpty();
        boolean expResult = true;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testIsEmptyWithNOTEmptyList() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{1.3, "dog"});
        boolean actualResult = L.isEmpty();
        boolean expResult = false;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testToArrayWithEmptyList() {
        ImmutableLinkedList L = new ImmutableLinkedList();
        Object[] actualResult = L.toArray();
        Object[] expResult = new Object[]{};
        assertArrayEquals(expResult, actualResult);
    }
    @Test
    public void testToArray() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{1,4,8});
        L.toArray();
        ImmutableLinkedList actualResult = L;
        ImmutableLinkedList expResult = new ImmutableLinkedList(new Object[]{1,4,8});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testToArrayReturnValue() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{1,4,8});
        Object[] actualResult = L.toArray();
        Object[] expResult = new Object[]{1,4,8};
        assertArrayEquals(expResult, actualResult);
    }
    @Test
    public void testToStringReturnValue() {
        ImmutableLinkedList L = new ImmutableLinkedList(new Object[]{1,4,8});
        String actualResult = L.toString();
        String expResult = "[1, 4, 8]";
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testToStringWithEmptyList() {
        ImmutableLinkedList L = new ImmutableLinkedList();
        String actualResult = L.toString();
        String expResult = "[]";
        assertEquals(expResult, actualResult);
    }
}