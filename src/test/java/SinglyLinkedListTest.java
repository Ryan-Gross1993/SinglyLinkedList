import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ryan on 2/18/2018.
 */
public class SinglyLinkedListTest {

    SinglyLinkedList linkedList;
    Person personOne;

    @Before
    public void setup() {
        linkedList = new SinglyLinkedList();
        personOne = new Person("John", "Smith");
    }

    @Test
    public void linkedList_add() {
        linkedList.add(personOne);
        Assert.assertTrue(linkedList.size() == 1);

    }

    @Test
    public void linkedList_remove() {

    }
}
