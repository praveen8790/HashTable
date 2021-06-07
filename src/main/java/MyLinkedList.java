public class MyLinkedList<T extends Comparable<T>> {
    public INode head;
    INode tail;
    INode test;
    public void add(INode node){
        if(tail == null)
            this.tail = node;
        if(head != null)
            node.setNext(head);
        this.head = node;
    }
    public void append(INode node){
        if(head == null) {
            this.head = node;
        }
        if(tail != null)
            this.tail.setNext(node);
        this.tail = node;

    }

    public void insert(INode searchelement,INode node){
        INode search = search((T) searchelement.getKey());
        if(search != tail){
            node.setNext(search.getNext());
            search.setNext(node);
        }
        else{ // to add at last of list
            this.tail.setNext(node);
            this.tail = node;
        }
    }
    public void deleteElementAtHead(){
        if (head == null)
            System.out.println("LinkedList is Empty");
        else {
            this.head = head.getNext();

        }
    }
    public void delete(INode data){
        INode delete = search((T) data.getKey());
        if(delete == head)
            deleteElementAtHead();
        else if(delete == tail)
            deleteElementAtTail();
        else
        {
            INode temp = head;
            while(temp.getNext() != delete)
                temp = temp.getNext();
            temp.setNext(delete.getNext());
        }
    }
    public void deleteElementAtTail(){
        INode search = head;
        while(search.getNext()!= tail)
        {
            search = search.getNext();
        }
        this.tail=search;
        search.setNext(null);
        }

    public INode search(T data){
        INode search = head;
        while(search!=null)
        {
            if(search.getKey().equals(data)) {
                return search;
            }
            search = search.getNext();
        }
       return null;
    }
    public boolean searchable(INode data){
        if(search((T) data.getKey()).getKey()==data.getKey())
            return true;
        else
            return false;
    }
    public void print(){
        INode node = head;
        while(node != null){
            System.out.println(node.getKey());
            node = node.getNext();
        }
    }
    public int size(){
        INode search = head;
        int count=1;
        while(search!=null)
        {
           count += 1;
           search=search.getNext();
        }
        return count;
    }


    // these methods are for tests only.
    public void testCaseSetHead(){
        this.test=head;
    }
    public void testCaseSetter(){
        this.test = test.getNext();
    }
    public T testCaseMethod(){
        return (T) test.getKey();
    }
}
