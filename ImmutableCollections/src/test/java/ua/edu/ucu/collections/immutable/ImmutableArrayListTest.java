package ua.edu.ucu.collections.immutable;


import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableArrayListTest {

    @Test
    public void testAdd() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{0,4,5});
        L.add(0);
        ImmutableArrayList actualResult = L;
        ImmutableArrayList expResult = new ImmutableArrayList(new Object[]{0,4,5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testAddReturnValue() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{0,1,2,5});
        ImmutableArrayList actualResult = L.add(3);
        ImmutableArrayList expResult = new ImmutableArrayList(new Object[]{0,1,2,5,3});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testAddAll() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{0,1,2,5});
        L.addAll(new Object[]{3,0,0});
        ImmutableArrayList actualResult = L;
        ImmutableArrayList expResult = new ImmutableArrayList(new Object[]{0,1,2,5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testAddAllReturnValue() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{0,1,2,5});
        ImmutableArrayList actualResult = L.addAll(new Object[]{3,0,0});
        ImmutableArrayList expResult = new ImmutableArrayList(new Object[]{0,1,2,5,3,0,0});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testAddAllWithIndex() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{0,1,2,5});
        L.addAll(2, new Object[]{3,0,0});
        ImmutableArrayList actualResult = L;
        ImmutableArrayList expResult = new ImmutableArrayList(new Object[]{0,1,2,5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testAddAllWithIndexReturnValue() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{0,1,2,5});
        ImmutableArrayList actualResult = L.addAll(2, new Object[]{3,0,0});
        ImmutableArrayList expResult = new ImmutableArrayList(new Object[]{0,1,3,0,0,2,5});
        assertEquals(expResult, actualResult);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveWithEmptyList() {
        ImmutableArrayList L = new ImmutableArrayList();
        L.remove(1);
    }
    @Test
    public void testRemove() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{0,1,2,3,4,5});
        L.remove(0);
        ImmutableArrayList actualResult = L;
        ImmutableArrayList expResult = new ImmutableArrayList(new Object[]{0,1,2,3,4,5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testRemoveReturnValue() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{0,1,2,3,4,5});
        ImmutableArrayList actualResult = L.remove(3);
        ImmutableArrayList expResult = new ImmutableArrayList(new Object[]{0,1,2,4,5});
        assertEquals(expResult, actualResult);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetWithEmptyList() {
        ImmutableArrayList L = new ImmutableArrayList();
        L.set(0,5);
    }
    @Test
    public void testSet() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{0, 1, 2, 3, 4, 5});
        ImmutableArrayList actualResult = L;
        L.set(3,7);
        ImmutableArrayList expResult = new ImmutableArrayList(new Object[]{0, 1, 2, 3, 4, 5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testSetReturnValue() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{0, 1, 2, 3, 4, 5});
        ImmutableArrayList actualResult = L.set(2,10);
        ImmutableArrayList expResult = new ImmutableArrayList(new Object[]{0, 1, 10, 3, 4, 5});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testIndexOf() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{0, 1, ":)", 3, 4, 5});
        int actualResult = L.indexOf(":)");
        int expResult = 2;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testIndexOfWithoutSuchElement() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{0, 1, ":)", 3, 4, 5});
        int actualResult = L.indexOf(":(");
        int expResult = -1;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testIndexOfWithEmptyList() {
        ImmutableArrayList L = new ImmutableArrayList();
        int actualResult = L.indexOf("any element");
        int expResult = -1;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testSizeWithEmptyList() {
        ImmutableArrayList L = new ImmutableArrayList();
        int actualResult = L.size();
        int expResult = 0;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testSize() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{1,3,5});
        int actualResult = L.size();
        int expResult = 3;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testIsEmptyWithEmptyList() {
        ImmutableArrayList L = new ImmutableArrayList();
        boolean actualResult = L.isEmpty();
        boolean expResult = true;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testIsEmptyWithNOTEmptyList() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{1.3, "dog"});
        boolean actualResult = L.isEmpty();
        boolean expResult = false;
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testToArrayWithEmptyList() {
        ImmutableArrayList L = new ImmutableArrayList();
        Object[] actualResult = L.toArray();
        Object[] expResult = new Object[]{};
        assertArrayEquals(expResult, actualResult);
    }
    @Test
    public void testToArray() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{1,4,8});
        L.toArray();
        ImmutableArrayList actualResult = L;
        ImmutableArrayList expResult = new ImmutableArrayList(new Object[]{1,4,8});
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testToArrayReturnValue() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{1,4,8});
        Object[] actualResult = L.toArray();
        Object[] expResult = new Object[]{1,4,8};
        assertArrayEquals(expResult, actualResult);
    }
    @Test
    public void testToStringReturnValue() {
        ImmutableArrayList L = new ImmutableArrayList(new Object[]{1,4,8});
        String actualResult = L.toString();
        String expResult = "[1, 4, 8]";
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testToStringWithEmptyList() {
        ImmutableArrayList L = new ImmutableArrayList();
        String actualResult = L.toString();
        String expResult = "[]";
        assertEquals(expResult, actualResult);
    }
}