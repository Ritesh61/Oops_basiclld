package isp.violation;

public class PureBatsman implements Player {
    @Override
    public void bat() {
        System.out.println("PureBatsman can bat");
    }

    @Override
    public void bowl() {
        throw new RuntimeException("PureBatsman cannot bowl");
    }

    @Override
    public void field() {
        System.out.println("PureBatsman can field");
    }

    @Override
    public void keep() {
        throw new RuntimeException("PureBatsman cannot keep");
    }
}
