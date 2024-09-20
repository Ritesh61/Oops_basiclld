package springboot.reflection;

public class Vehicle {

    public Motor motor;
    public GasChamber gasChamber;

    public Vehicle(Motor motor, GasChamber gasChamber) {
        this.gasChamber = gasChamber;
        this.motor = motor;
    }
}
