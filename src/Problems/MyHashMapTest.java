package Problems;

public class MyHashMapTest {
    // test
    public static void start() {
        MyHashMap myHashMap = new MyHashMap();
        // myHashMap.put(1, 100); // index: 1
        // myHashMap.put(2, 200);
        // myHashMap.put(12, 1200); // index: 1
        // myHashMap.put(12, 1201); // index: 1 override previous

        // myHashMap.get(12); // 1201

        myHashMap.put(0, 100); // index: 1
        myHashMap.remove(0);
        myHashMap.remove(-100);
    }
}