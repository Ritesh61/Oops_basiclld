package ticTacToe.second;

import java.util.Random;

public class ComputerPlayer implements Player {

    private final char symbol;

    public ComputerPlayer(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public Move play() {
        Random rand = new Random();
        int x = rand.nextInt(3), y = rand.nextInt(3);
        return new Move(x, y);
    }

    @Override
    public char getSymbol() {
        return this.symbol;
    }
}
