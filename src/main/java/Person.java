/**
 * Created by Ryan on 2/18/2018.
 */
public class Person {

    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String greet() {
        return "Hello, I'm " + firstName + lastName;
    }
}
