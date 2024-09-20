package finalKeyword;

public class PersonTester {

    public static void main(String[] args) {
        Property property =  new Property(100, 50);
        Person Person = new Person(20, property);
        printPerson(Person);
    }

    private static void printPerson(Person person) {
        System.out.println("Age: "+ person.getAge());
        System.out.println("Bank balance: "+ person.getProperty().getBankBalance());
        System.out.println("Investments: "+ person.getProperty().getInvestments());

    }
}
/**
 * direct access of instance variables must be stopped, data must be hidden
 * i.e. variables must be private and getter must be public
 * public setters with right set of rules
 * Encapsulation refers to the bundling of data with methods that operate on the data
 * or the restricting of direct access to some of an object's components
 * i.e. Data hiding and protection
 * with the practice of encapsulation, backward compatibility is also maintained
 *
 */
