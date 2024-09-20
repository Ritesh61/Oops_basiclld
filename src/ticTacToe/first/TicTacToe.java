package ticTacToe.first;

public class TicTacToe {

    public final Player player1, player2;
    public final Board board;

    public TicTacToe(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

    Result startGame() {
        Player currentPlayer = this.player1;
        while(!board.isFull()) {
            Move move = currentPlayer.play();
            if(!this.board.isMoveAppliedSuccessfully(move, currentPlayer.getSymbol()))
            {
                System.out.println(currentPlayer.getSymbol()+ " enter again");
                continue;
            }
            if(this.board.isWinningChance(currentPlayer.getSymbol())) {
                return new Result(false, currentPlayer);
            }
            if(currentPlayer == this.player1)
                currentPlayer = this.player2;
            else
                currentPlayer = this.player1;
        }
        return new Result(true, null);
    }
}
/**
 * 0 0
 * 0 0
 * 1 2
 * 0 0
 * 1 1
 * 2 2
 * 1 0
 */