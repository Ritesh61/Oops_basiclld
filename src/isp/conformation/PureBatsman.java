package isp.conformation;

public class PureBatsman implements IBatter, IFielder {
    @Override
    public void bat() {
        System.out.println("PureBatsman can bat");
    }

    @Override
    public void field() {
        System.out.println("PureBatsman can field");
    }
}
