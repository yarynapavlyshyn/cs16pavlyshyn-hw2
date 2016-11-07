package ua.edu.ucu.collections.immutable;

/**
 * Created by cs.ucu.edu.ua on 11/4/2016.
 */
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList {
    private Object[] data;
    private int count = 0;
    private int SIZE = 10;

    public ArrayList() {
        data = new Object[this.SIZE];
    }
    public ArrayList(Object[] elements) {
        data = elements;
        while (count < elements.length && elements[count] != null) {
            ++count;
        }
    }
    public Object get(int index) {
        if (index >= count) {
            throw new ArrayIndexOutOfBoundsException();
        }
            return data[index];
    }
    public void add(Object o) {
        add(count, o);
    }
    public void add(int index, Object obj) {
        if (index > count) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (data.length < count + 1) {
            this.reSizeArray();
        }
        for (int i = count; i > index; --i) {
            data[i] = data[i - 1];
        }
        data[index] = obj;
        ++count;
    }
    public void addAll(Object[] c){
        addAll(count, c);
    }
    public void addAll(int index, Object[] c) {
        for (int i = 0; i < c.length; ++i) {
            add(i + index, c[i]);
        }
    }
    public void set(int index, Object o) {
        if (index >= count) {
            throw new ArrayIndexOutOfBoundsException();
        }
        data[index] = o;
    }
    public Object remove(int index) {
        if (index >= count) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object obj = data[index];
        int temp = index;
        data[index] = null;

        while (temp < count - 1) {
            data[temp] = data[temp + 1];
            data[temp + 1] = null;
            temp++;
        }
        count--;
        return obj;
    }
    public int indexOf(Object e) {
        for (int i = 0; i < count; ++i) {
            if (data[i] == e)
                return i;
        }
        return -1;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public Object[] toArray() {
        Object[] a = Arrays.copyOf(data, size());
        return a;
    }
    public void reSizeArray() {
        data = Arrays.copyOf(data, data.length * 2);
    }
    public int size() {
        return count;
    }
    public String toString(){
        if (size() == 0)
            return "[]";
        String toReturn = "["+ data[0];
        for (int i = 1; i < size(); ++i) {
            toReturn += ", "+ data[i];
        }
        toReturn += "]";
        return toReturn;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ArrayList L = (ArrayList) obj;
        if (size() != L.size())
            return false;
        for (int i = 0; i < size(); ++i) {
            if (this.get(i).equals(L.get(i)) == false)
                return false;
        }
        return true;
    }
}