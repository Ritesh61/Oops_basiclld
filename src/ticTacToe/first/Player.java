package ticTacToe.first;

import java.util.Scanner;

public class Player {

    private final char symbol ;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public Move play() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt();
        return new Move(x, y);
    }
    public char getSymbol() {
        return symbol;
    }
}
