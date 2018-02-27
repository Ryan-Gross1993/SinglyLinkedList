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

            this.linkedListNode = nodeToAdd;

        } else {

            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }

            currentNode.nextNode = nodeToAdd;
            nodeToAdd.previousNode = currentNode;

        }

    }

    public void remove(int index) {

        int counter = 0;
        LinkedListNode currentNode = this.linkedListNode;

        if (index == counter) {
            if (this.size() > 1) {

                currentNode = currentNode.nextNode;
                currentNode.previousNode = null;

            } else {

                this.linkedListNode = null;
            }

        } else {

            while (counter != index) {

                if (counter == index) {

                    currentNode.previousNode.nextNode = currentNode.nextNode;
                    currentNode.nextNode.previousNode = currentNode.previousNode;
                    return;

                } else {

                    counter++;

                    currentNode = currentNode.nextNode;

                }
            }
        }
    }

    public boolean contains(Object element) {

        LinkedListNode currentNode = this.linkedListNode;

        while (currentNode.nextNode != null) {

            if (currentNode.getValue() == element) {
                return true;
            }

            currentNode = currentNode.nextNode;

        }

        return false;

    }

    public int find(Object element) {

        int currentIndex = 0;
        LinkedListNode currentNode = this.linkedListNode;

        if (currentNode.getValue() == element) {

            return 0;

        }

           while (currentNode.nextNode != null) {

               if (currentNode.getValue() == element) {
                   return currentIndex;
               }
                   currentNode = currentNode.nextNode;
                   currentIndex++;

           }
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

        SinglyLinkedList copyOfList = new SinglyLinkedList();

        for (int i = 0; i != size(); i++) {

            copyOfList.add(this.get(i));

        }

        return copyOfList;
    }

    public LinkedListNode get(int index) {

        LinkedListNode currentNode = this.linkedListNode;
        int counter = 0;

        while (currentNode.nextNode != null) {

            if (counter == index) {
                return currentNode;
            }
            counter++;
            currentNode = currentNode.nextNode;
        }
        return currentNode;
    }

    public void sort() {
    }

    public void reverse() {
    }

    public SinglyLinkedList slice(int start, int end) {
        return null;
    }

}
