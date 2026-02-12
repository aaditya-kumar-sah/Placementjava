package hashmap;
import java.util.*;

public class implimenthashmap {

    static class MyHashMap<K, V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = .75f;
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node> [] buckets;

        private void initBuckets(int N){
            buckets = new LinkedList[N];
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
                
            }
        }

        public HashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size(){
            return n;
        }

        public void put(K key, V value){ // insert and update

        }

        public V get(K key){

        }

        public V remove(K key){

        }

    }
    public static void main(String args[]){
        MyHashMap<String, Integer> mp = new MyHashMap<>();

    }
}
