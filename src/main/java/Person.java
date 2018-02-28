/**
 * Created by ryan_gross on 2/28/18.
 */
public class Person {

    private String firstName;

    private String lastName;

    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String greet() {
        return "Hello, I'm " + firstName + " " + lastName;
    }

}
