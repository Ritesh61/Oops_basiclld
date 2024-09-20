package isp.conformation;

public class CricketGameHelper {

    public void bat(IBatter IBatter) { IBatter.bat(); }

    public void bowl(IBowler IBowler) { IBowler.bowl(); }

    public void field(IFielder IFielder) { IFielder.field(); }

    public void keep(IWicketKeeper keeper) { keeper.keep(); }
}
