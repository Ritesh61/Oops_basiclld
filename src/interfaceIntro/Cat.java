package interfaceIntro;

public class Cat implements Animal, Attackable{
    @Override
    public void speak() {
        System.out.println("Mew mew");
    }

    @Override
    public void move() {
        System.out.println("cat is walking");
    }

    public void attack() { System.out.println("cat attacks"); }
}
