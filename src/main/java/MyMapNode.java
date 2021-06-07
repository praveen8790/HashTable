public class MyMapNode <T extends Comparable<T>,V>implements INode{
    T key;
    V value;
    MyMapNode next;
    @Override
    public Comparable getKey() {
        return (Comparable) key;
    }

    @Override
    public void setKey(Comparable key) {
        this.key = (T) key;
    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MyMapNode<T,V>) next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyMapNode(T key, V value) {
        this.key = key;
        this.value = value;
    }
}
