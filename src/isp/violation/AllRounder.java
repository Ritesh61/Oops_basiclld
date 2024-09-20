package isp.violation;

public class AllRounder implements Player{
    @Override
    public void bat() {
        System.out.println("All-Rounder can bat");
    }

    @Override
    public void bowl() {
        System.out.println("All-Rounder can bowl");
    }

    @Override
    public void field() {
        System.out.println("All-Rounder can field");
    }

    @Override
    public void keep() {
        throw new RuntimeException("All-Rounder cannot keep");
    }
}
