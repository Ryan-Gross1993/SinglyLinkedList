import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ryan on 2/18/2018.
 */
public class SinglyLinkedListTest {

    SinglyLinkedList linkedList;
    Person personOne;
    Person personTwo;
    Person personThree;
    Person personFour;

    @Before
    public void setup() {

        linkedList = new SinglyLinkedList();
        personOne = new Person("John", "Smith");
        personTwo = new Person("Carl", "Wheezer");
        personThree = new Person("Ash", "Ketchum");
        personFour = new Person("Peggy", "Hill");

        linkedList.add(personOne);
        linkedList.add(personTwo);
        linkedList.add(personThree);

    }

    @Test
    public void linkedList_add() {

        Assert.assertTrue(linkedList.size() == 3);

    }

    @Test
    public void linkedList_remove() {

        linkedList.remove(0);
        Assert.assertTrue(linkedList.size() == 3);

    }

    @Test
    public void linkedList_contains() {

        Assert.assertTrue(linkedList.contains(personOne));
        Assert.assertFalse(linkedList.contains(personFour));

    }

    @Test
    public void linkedList_find() {

        Assert.assertTrue(linkedList.find(personTwo) == 0);
        Assert.assertTrue(linkedList.find(personFour) == -1);

    }

    @Test
    public void linkedList_size() {

        Assert.assertTrue(linkedList.size() == 3);

        linkedList.add(personTwo);

        Assert.assertTrue(linkedList.size() == 4);

    }

    @Test
    public void linkedList_copy() {
        linkedList.add(personTwo);

        SinglyLinkedList copyOfLinkedList = linkedList.copy();

    }

    @Test
    public void linkedList_sort() {

        linkedList.sort();

        Person personAtIndexZero = (Person) linkedList.get(0).getValue();
        Person personAtEndOfList = (Person) linkedList.get(linkedList.size() - 1).getValue();

        Assert.assertTrue(personAtIndexZero.greet().equals("Hello, I'm Ash Ketchum"));
        Assert.assertTrue(personAtEndOfList.greet().equals("Hello, I'm John Smith"));

    }

    @Test
    public void linkedList_reverse() {

        linkedList.sort();
        linkedList.reverse();

        Person personAtIndexZero = (Person) linkedList.get(0).getValue();
        Person personAtEndOfList = (Person) linkedList.get(linkedList.size() - 1).getValue();

        Assert.assertTrue(personAtEndOfList.greet().equals("Hello, I'm Ash Ketchum"));
        Assert.assertTrue(personAtIndexZero.greet().equals("Hello, I'm John Smith"));

    }

   @Test
    public void linkedList_slice() {

        linkedList.add(personFour);

        SinglyLinkedList slicedList = linkedList.slice(2,4);

        Assert.assertTrue(slicedList.size() == 2);
        Assert.assertTrue(slicedList.get(0).getValue() == personThree);
        Assert.assertTrue(slicedList.get(slicedList.size() - 1).getValue() == personFour);

   }

}
