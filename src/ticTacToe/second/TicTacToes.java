package ticTacToe.second;

public class TicTacToes {

    private final Player player1, player2;
    private final Board board;

    public TicTacToes(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

    public Result startGame() {

        Player currentPlayer = this.player1;
        while(!this.board.isFull()) {
            Move move = currentPlayer.play();
            if(!board.isMoveAppliedSuccessfully(move, currentPlayer.getSymbol())){
                System.out.println(currentPlayer.getSymbol()+ " enter again");
                continue;
            }
            if(this.board.isWinningChance(currentPlayer.getSymbol()))
                return new Result(currentPlayer, false);
            if(currentPlayer == this.player1)
                currentPlayer = this.player2;
            else
                currentPlayer = this.player1;
        }
        return new Result(null, true);
    }
}
