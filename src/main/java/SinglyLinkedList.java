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

        LinkedListNode currentNode = this.linkedListNode;

        LinkedListNode nodeToAdd = new LinkedListNode();
        nodeToAdd.nodeElement = element;

        if (currentNode == null) {

            currentNode = nodeToAdd;
            this.linkedListNode = currentNode;

        } else {

            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = nodeToAdd;

        }

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
        int counter = 1;

        if (this.linkedListNode == null) {
            return counter;
        } else {
            LinkedListNode currentNode = linkedListNode;
            while (currentNode.nextNode != null) {
                counter++;
                currentNode = currentNode.nextNode;
            }
        }
        return counter;
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
