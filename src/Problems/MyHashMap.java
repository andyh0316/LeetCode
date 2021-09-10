package Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap {
    List<Bucket> hashMap;
    int space = 10;

    public MyHashMap() {
        this.hashMap = new ArrayList<Bucket>();
        for (int i = 0; i < this.space; i++) {
            this.hashMap.add(new Bucket());
        }
    }

    public int get(int key) {
        int hashIndex = key % this.space;
        return this.hashMap.get(hashIndex).get(key);
    }

    public void put(int key, int value) {
        int hashIndex = key % this.space;
        this.hashMap.get(hashIndex).update(key, value);
    }

    public void remove(int key) {
        int hashIndex = key % this.space;
        this.hashMap.get(hashIndex).remove(key);
    }

    class Pair {
        public Integer first;
        public Integer second;

        public Pair(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }
    }

    class Bucket {
        LinkedList<Pair> bucket;

        public Bucket() {
            bucket = new LinkedList<Pair>();
        }

        public int get(Integer key) {
            for (Pair pair : bucket) {
                if (pair.first.equals(key)) { // found
                    return pair.second;
                }
            }

            return -1;
        }

        public void update(Integer key, Integer value) {
            for (Pair pair : bucket) {
                if (pair.first.equals(key)) { // found
                    pair.second = value;
                    return;
                }
            }

            // if reached here: not found, add new pair to the end
            Pair pair = new Pair(key, value);
            bucket.add(pair);
        }

        public void remove(Integer key) {
            for (Pair pair : bucket) {
                if (pair.first.equals(key)) { // found
                    bucket.remove(pair);
                    break;
                }
            }
        }
    }
}