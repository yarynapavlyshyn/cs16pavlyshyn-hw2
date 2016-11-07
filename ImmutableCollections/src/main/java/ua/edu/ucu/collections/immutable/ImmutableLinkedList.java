package ua.edu.ucu.collections.immutable;

public class ImmutableLinkedList implements ImmutableList {
    private LinkedList LIST;

    public ImmutableLinkedList() {
        this.LIST = new LinkedList();
    }

    public ImmutableLinkedList(LinkedList L) {
        this.LIST = L;
    }

    public ImmutableLinkedList(Object[] elements) {
        this.LIST = new LinkedList();
        for (Object o: elements) {
            LIST.add(o);
        }
    }
    public ImmutableLinkedList add(Object e){
        return add(size(), e);
    }

    public ImmutableLinkedList add(int index, Object e) {
        LinkedList l = LIST.copy();
        l.add(index, e);
        return new ImmutableLinkedList(l);
    }
    public ImmutableLinkedList addFirst(Object e) {
        return add(0, e);
    }

    public ImmutableLinkedList addLast(Object e) {
        return add(e);
    }

    public ImmutableLinkedList addAll(Object[] c){
        return addAll(size(),c);
    }

    public ImmutableLinkedList addAll(int index, Object[] c){
        LinkedList l = LIST.copy();
        l.addAll(index, c);
        return new ImmutableLinkedList(l);
    }
    public Object get(int index){
        return LIST.get(index);
    }
    public Object getFirst() {
        return get(0);
    }
    public Object getLast(){
        return get(size() - 1);
    }
    public ImmutableLinkedList remove(int index){
        LinkedList l = LIST.copy();
        l.remove(index);
        return new ImmutableLinkedList(l);
    }
    public ImmutableLinkedList removeFirst() {
        return remove(0);
    }
    public ImmutableLinkedList removeLast() {
        return remove(size() - 1);
    }

    public ImmutableLinkedList set(int index, Object e){
        LinkedList l = LIST.copy();
        l.set(index, e);
        return new ImmutableLinkedList(l);
    }

    public int indexOf(Object e){
        return LIST.indexOf(e);
    }

    public int size(){
        return LIST.size();
    }

    public ImmutableLinkedList clear(){
        return new ImmutableLinkedList(new Object[]{});
    }

    public boolean isEmpty(){
        return LIST.isEmpty();
    }

    public Object[] toArray(){
        return LIST.toArray();
    }

    public LinkedList toLinkedList() {
        return LIST.copy();
    }

    public String toString(){
        return LIST.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ImmutableLinkedList L = (ImmutableLinkedList) obj;
        return toLinkedList().equals(L.toLinkedList());
    }
}