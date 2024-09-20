package isp.violation;

import java.util.List;

public class CricketGameHelper {

    public void startGame(List<Player> players) {
        for(Player player: players) {
            if(player instanceof PureBatsman) {
                player.bat();
                player.field();
            } else if (player instanceof AllRounder) {
                player.bowl();
                player.field();
                player.bat();
            } else if (player instanceof Keeper) {
                player.bat();
                player.keep();
            }
        }
    }
}
