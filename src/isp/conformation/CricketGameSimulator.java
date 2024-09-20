package isp.conformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CricketGameSimulator {

    public final List<isp.conformation.PureBatsman> pureBatsmen;
    public final List<isp.conformation.AllRounder> allRounders;
    public final isp.conformation.Keeper keeper ;
    public final CricketGameHelper cricketGameHelper;


    public CricketGameSimulator(List<PureBatsman> pureBatsmen, List<isp.conformation.AllRounder> allRounders, isp.conformation.Keeper keeper, CricketGameHelper cricketGameHelper) {
        this.pureBatsmen = pureBatsmen;
        this.allRounders = allRounders;
        this.keeper = keeper;
        this.cricketGameHelper = cricketGameHelper;
    }


    private void startBatting() {
        for(int i = 0; i < pureBatsmen.size() ; i++)
            cricketGameHelper.bat(pureBatsmen.get(i));
        cricketGameHelper.bat(keeper);
        for(int i = 0; i < allRounders.size(); i++)
            cricketGameHelper.bat(allRounders.get(i));
    }

    private void startBowling() {
        for(int i = 0; i < allRounders.size(); i++)
            cricketGameHelper.bowl(allRounders.get(i));
    }

    private void startFielding() {
        for(int i = 0; i < pureBatsmen.size() ; i++)
            cricketGameHelper.field(pureBatsmen.get(i));
        for(int i = 0; i < allRounders.size(); i++)
            cricketGameHelper.field(allRounders.get(i));
    }

    private void startKeeping() {
        cricketGameHelper.keep(keeper);
    }

    private void simulate() {
        System.out.println("Match started");
        startBatting();
        startBowling();
        startFielding();
        startKeeping();
        System.out.println("Match ended");
    }


    public static void main(String[] args) {
        //List<PureBatsman> pureBatsmen = Arrays.asList(new PureBatsman());
        List<PureBatsman> pureBatsmen = new ArrayList<>();
        List<AllRounder> allRounders = new ArrayList<>();
        for(int i=0;i<4;i++)
            pureBatsmen.add(new isp.conformation.PureBatsman());
        for(int i=0;i<6;i++)
            allRounders.add(new AllRounder());
        CricketGameSimulator cricketGameSimulator = new CricketGameSimulator(pureBatsmen,
                allRounders, new Keeper(), new CricketGameHelper());
        cricketGameSimulator.simulate();


    }
}
