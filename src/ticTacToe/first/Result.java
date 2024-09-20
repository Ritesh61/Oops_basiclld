package ticTacToe.first;

public class Result {

    public final boolean isDraw;
    public final Player player;


    public Result(boolean isDraw, Player player) {
        this.isDraw = isDraw;
        this.player = player;
    }

    public boolean isDraw() {
        return isDraw;
    }

    public Player getPlayer() {
        return player;
    }
}
