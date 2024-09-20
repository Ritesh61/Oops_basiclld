package isp.conformation;

public class Keeper implements IBatter, IWicketKeeper {
    @Override
    public void bat() {
        System.out.println("Keeper can bat");
    }

    @Override
    public void keep() {
        System.out.println("Keeper can keep");
    }
}
