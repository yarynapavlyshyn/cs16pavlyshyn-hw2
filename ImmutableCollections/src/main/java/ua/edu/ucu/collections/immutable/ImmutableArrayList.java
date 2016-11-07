package ua.edu.ucu.collections.immutable;

public class ImmutableArrayList {
    private ArrayList LIST;

    public ImmutableArrayList() {
        LIST = new ArrayList();
    }
    public ImmutableArrayList(Object[] elements) {
        LIST = new ArrayList(elements);
    }

    public ImmutableArrayList(ArrayList L) {
        LIST = L;
    }
    public ImmutableArrayList add(Object e){
        return (add(size(), e));
    }
    public ImmutableArrayList add(int index, Object e){
        ArrayList a = new ArrayList(LIST.toArray());
        a.add(index, e);
        return (new ImmutableArrayList(a));
    }
    public ImmutableArrayList addAll(Object[] c){
        return addAll(size(), c);
    }
    public ImmutableArrayList addAll(int index, Object[] c){
        ArrayList l = (new ArrayList(LIST.toArray()));
        l.addAll(index, c);
        return (new ImmutableArrayList(l));
    }
    public Object get(int index) {
        return LIST.get(index);
    }
    public ImmutableArrayList remove(int index) {
        ArrayList l = (new ArrayList(LIST.toArray()));
        l.remove(index);
        return (new ImmutableArrayList(l));
    }
    public ImmutableArrayList set(int index, Object e){
        ArrayList l = (new ArrayList(LIST.toArray()));
        l.set(index, e);
        return (new ImmutableArrayList(l));
    }
    public int indexOf(Object e){
        return LIST.indexOf(e);
    }
    public int size(){
        return this.LIST.size();
    }
    public ImmutableArrayList clear() {
        return new ImmutableArrayList();
    }
    public boolean isEmpty(){
        return LIST.isEmpty();
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ImmutableArrayList L = (ImmutableArrayList) obj;
        return toArrayList().equals(L.toArrayList());
    }
    public Object[] toArray(){
        return LIST.toArray();
    }
    public ArrayList toArrayList(){
        return new ArrayList(toArray());
    }
    public String toString() {
        return LIST.toString();
    }
}