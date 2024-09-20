package finalKeyword;

public class PropertyTester {

    public static void main(String[] args) {
        Property property = new Property(100.0, 70.0);
        //property.investments = 0; error
        property = new Property(20, 20); //no error

        Property prop1 = property;
        prop1.bankBalance = 10;
        //System.out.println("Prop1 bankBalance : "+ prop1.bankBalance);
        //System.out.println("Prop bankBalance : "+ property.bankBalance);

        prop1 = new Property(property.bankBalance, property.investments);
        prop1.bankBalance = 120;
        //System.out.println("Prop1 bankBalance : "+ prop1.bankBalance);
        //System.out.println("Prop bankBalance : "+ property.bankBalance);


        Property prop = new Property(100, 50);
        Person person = new Person(10, prop);
        System.out.println(person.age+ " "+ person.property.bankBalance+ " "+ person.property.investments);
        person.property.bankBalance = 200;
        System.out.println(person.age+ " "+ person.property.bankBalance+ " "+ person.property.investments);

        Property p1 = person.property;
        p1 = new Property(250, 200);
        System.out.println(person.property.bankBalance);
    }
}

/**
 * property ==> [100.0, 70.0] immutable class
 * property ==> [20, 20] new object created
 *
 * prop1 ==> [20, 20]
 *
 * If all the instance vbls of a class are final, then not necessary that the object is also immutable
 */
