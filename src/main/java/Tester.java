public class Tester {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList<>();
        INode node1 = new Node(56);
        INode node2 = new Node(30);
        INode node3 = new Node(70);
        INode node4 = new Node(40);
        INode node5 = new Node(20);
        INode node6 = new Node(70);


        linkedList.append(node1);
        linkedList.append(node2);
        linkedList.append(node3);
        linkedList.add(node4);
        linkedList.append(node5);

        linkedList.delete(node6);
        linkedList.print();
    }
}
