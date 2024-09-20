package isp.violation;

public class Keeper implements Player {
    @Override
    public void bat() {
        System.out.println("Keeper can bat");
    }

    @Override
    public void bowl() {
        throw new RuntimeException("Keeper cannot bowl");
    }

    @Override
    public void field() {
        throw new RuntimeException("Keeper cannot field");
    }

    @Override
    public void keep() {
        System.out.println("Keeper can keep");
    }
}
