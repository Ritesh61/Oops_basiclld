package ticTacToe.second;

public class TicTacToeSimulator {

    public static void main(String[] args) {

        GeneralBoard board =  new GeneralBoard();
        TicTacToes ticTacToes = new TicTacToes(new HumanPlayer('X'), new HumanPlayer('O'),
                board);
        Result result = ticTacToes.startGame();
        if(result.isDraw())
            System.out.println("It is a draw");
        else
            System.out.println(result.getPlayer().getSymbol()+ " has won");
        board.printBoard();
    }
}
