import java.util.Locale;

public class MyHashTable<T extends Comparable<T>,V> {


    MyLinkedList<T> list ;

    public MyHashTable() {
        this.list = new MyLinkedList<>();
    }
    public  V get(T key){
        MyMapNode<T,V> mapNode =(MyMapNode<T,V>) this.list.search(key);
        return (mapNode == null)? null: mapNode.getValue();
    }
    public void add(T key, V value){
        MyMapNode<T,V> mapNode = (MyMapNode<T,V>) this.list.search(key);
        if (mapNode == null){
            mapNode = new MyMapNode<>(key,value);
            this.list.append(mapNode);
        }
        else
            mapNode.setValue(value);
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
