/**
 * Created by Ryan on 2/18/2018.
 */
public class SinglyLinkedList {

    LinkedListNode linkedListNode;

    protected class LinkedListNode {

        LinkedListNode previousNode;
        Object nodeElement;
        LinkedListNode nextNode;

        public Object getValue() {
            return this.nodeElement;
        }
    }

    public void add(Object element) {

    }

    public void remove(int index) {

    }

    public boolean contains(Object element) {
        return true;
    }

    public int find(Object element) {
        return -1;
    }

    public int size() {
        return 0;
    }

    public SinglyLinkedList copy() {
        return null;
    }

    public LinkedListNode get(int index) {
        return null;
    }

    public void sort() {
    }

    public void reverse() {
    }

    public SinglyLinkedList slice(int start, int end) {
        return null;
    }

}
