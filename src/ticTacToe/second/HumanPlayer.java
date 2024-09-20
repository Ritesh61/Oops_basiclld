package ticTacToe.second;

import java.util.Scanner;

public class HumanPlayer implements Player {

    private final char symbol;

    public HumanPlayer(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public Move play() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt();
        return new Move(x, y);
    }

    @Override
    public char getSymbol() {
        return this.symbol;
    }
}
