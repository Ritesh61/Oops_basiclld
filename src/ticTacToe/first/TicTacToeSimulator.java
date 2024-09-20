package ticTacToe.first;

public class TicTacToeSimulator {

    public static void main(String[] args) {
        Board board = new Board();
        TicTacToe ticTacToe = new TicTacToe(new Player('X'), new Player('O'),
                board);
        Result result = ticTacToe.startGame();
        if(result.isDraw())
            System.out.println("It is a draw");
        else
            System.out.println(result.getPlayer().getSymbol()+ " has won");
        board.printBoard();

    }
}
/**
 * 0 0
 * 0 1
 * 1 1
 * 2 2
 * 1 0
 * 2 0
 * 0 2
 * 2 1
 */
