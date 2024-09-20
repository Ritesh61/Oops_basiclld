package finalKeyword;

public class Person {

    public  int age;
    public  Property property;

    public void setAge() {
        if(age > 0)
            this.age =  age;
    }

    public void setProperty(Property property) {
        if(property.getInvestments() > 0 && property.getBankBalance() > 0) {
            this.property = property;
        }
    }

    public int getAge() {
        return age;
    }

    public Property getProperty() {
        return property;
    }



    public Person(int age, Property property) {
        this.age = age;
        this.property = property;
    }
}
