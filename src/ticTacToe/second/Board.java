package ticTacToe.second;

public interface Board {

    boolean isFull();
    boolean isMoveAppliedSuccessfully(Move move, char symbol);
    boolean isWinningChance(char symbol);
}
