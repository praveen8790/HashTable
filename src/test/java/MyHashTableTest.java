import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class MyHashTableTest {
    @Test
    void hashFrequencyOfRepeatingTest() {
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
        Assertions.assertEquals(2,freq);
    }
    }