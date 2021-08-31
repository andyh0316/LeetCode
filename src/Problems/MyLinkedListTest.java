package Problems;

public class MyLinkedListTest {
    public static void start() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2); // linked list becomes 1->2->3
        int result1 = myLinkedList.get(1); // return 2
        // myLinkedList.deleteAtIndex(1); // now the linked list is 1->3
        // myLinkedList.get(1); // return 3
    }
}
