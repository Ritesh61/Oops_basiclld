package isp.violation;

import isp.conformation.IWicketKeeper;

import java.util.ArrayList;
import java.util.List;

public class CricketGameSimulator {


    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        for(int i=0;i<6;i++)
            playerList.add(new AllRounder());
        for(int i=0;i<4;i++)
            playerList.add(new PureBatsman());
        playerList.add(new Keeper());


        CricketGameHelper cricketGameHelper = new CricketGameHelper();
        cricketGameHelper.startGame(playerList);
    }
}
