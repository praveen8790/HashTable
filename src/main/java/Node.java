public class Node<T extends Comparable<T>> implements INode<T> {
    public T data;
    public INode next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getKey() {
        return data;
    }

    public void setKey(T data) {
        this.data = data;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}
