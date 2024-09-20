package inhertance2;

import java.util.List;

public class PlayerTester {

    public static void main(String[] args) {
        Player computerPlayer =  new ComputerPlayer();
        //computerPlayer.celebrateVictory();
        Player humanPlayer = new HumanPlayer();
        //humanPlayer.celebrateVictory();
        humanPlayer.play();
        computerPlayer.play();

        //computerPlayer.play() // error
    }

    public void startGame(List<Player> playerList) {
        playerList.get(0).play();
    }
}
/**
 * inheritance IS-A relationship
 * special kind of polymorphism where parent class can point to objects of child class
 */
