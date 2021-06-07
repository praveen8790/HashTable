public interface INode<T extends Comparable<T>>{
    T getKey();
    void setKey(T key);
    INode<T> getNext();
    void setNext(INode next);
}
