package isp.conformation;

public class AllRounder implements IBatter, IBowler, IFielder {
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
}
