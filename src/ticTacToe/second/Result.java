package ticTacToe.second;

public class Result {

    private final Player player;
    private final boolean isDraw;

    public Result(Player player, boolean isDraw) {
        this.player = player;
        this.isDraw = isDraw;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isDraw() {
        return isDraw;
    }
}
