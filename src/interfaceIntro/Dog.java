package interfaceIntro;

public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("woof woof");
    }

    @Override
    public void move() {
        System.out.println("Dog is walking");
    }
}
