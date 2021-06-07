import java.util.ArrayList;
import java.util.Locale;

public class MyHashTable<T extends Comparable<T>,V> {

    ArrayList<MyLinkedList> arrayList;


    public MyHashTable() {
        this.arrayList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            this.arrayList.add(null);
        }
    }
    public int getHash(T key){
        return (Math.abs(key.hashCode()) % 10);
    }
    public  V get(T key){
        MyLinkedList list = this.arrayList.get(getHash(key));
        if (list == null)
            return null;
        MyMapNode<T,V> mapNode =(MyMapNode<T,V>) list.search(key);
        return (mapNode == null)? null : mapNode.getValue();
    }
    public void add(T key, V value){
        int index =getHash(key);
        MyLinkedList list = this.arrayList.get(index);
        if(list == null){
            list = new MyLinkedList();
            MyMapNode node = new MyMapNode(key,value);
            list.append(node);

        }
        else
        {
            MyMapNode<T,V> mapNode = (MyMapNode<T,V>) list.search(key);
            if (mapNode == null){
                mapNode = new MyMapNode<>(key,value);
                list.append(mapNode);
            }
            else
                mapNode.setValue(value);
        }
        this.arrayList.set(index,list);
    }


    public static void main(String[] args) {
        MyHashTable<String,Integer> hashTable = new MyHashTable();
        String sen = "to be or to be not";
        String[] words = sen.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = hashTable.get(word);
            if(value == null) value =1;
            else value =value+1;
            hashTable.add(word,value);
        }
        int freq = hashTable.get("to");
        System.out.println(freq);
    }
}