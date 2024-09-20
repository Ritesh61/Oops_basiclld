package ticTacToe.second;

public class GeneralBoard implements Board {

    private final char[][] generalBoard;

    public GeneralBoard() {
        this.generalBoard = new char[3][3];
        for(int i = 0; i<3;i++)
            for(int j=0;j<3;j++)
                this.generalBoard[i][j] = '.' ;
    }

    @Override
    public boolean isFull() {
        for(int i = 0; i<3;i++)
            for(int j=0;j<3;j++)
                if(this.generalBoard[i][j] == '.')
                    return false;
        return true;
    }

    @Override
    public boolean isMoveAppliedSuccessfully(Move move, char symbol) {
        int x = move.getX(), y= move.getY();
        if(this.generalBoard[x][y] != '.') {
            return false;
        }
        this.generalBoard[x][y] = symbol;
        return true;
    }

    @Override
    public boolean isWinningChance(char symbol) {
        return hasHorizontalWinningLine(symbol) || hasVerticalWinningLine(symbol)
                || hasDiagonalWinningLine(symbol) ;
    }

    private boolean hasDiagonalWinningLine(char symbol) {
        return (this.generalBoard[0][0] == symbol && this.generalBoard[1][1] == symbol && this.generalBoard[2][2] == symbol) ||
                (this.generalBoard[0][2] == symbol && this.generalBoard[1][1] == symbol && this.generalBoard[2][0] == symbol)
                ;
    }

    private boolean hasHorizontalWinningLine(char symbol) {
        for(int i=0 ; i<3;i++)
            if(this.generalBoard[i][0] == symbol && this.generalBoard[i][1] == symbol
                    && this.generalBoard[i][2] == symbol)
                return true;
        return false;
    }

    private boolean hasVerticalWinningLine(char symbol) {
        for(int i=0 ; i<3;i++)
            if(this.generalBoard[0][i] == symbol && this.generalBoard[1][i] == symbol
                    && this.generalBoard[2][i] == symbol)
                return true;
        return false;
    }

    public void printBoard() {
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(this.generalBoard[i][j] + " ");
            System.out.println();
        }
    }
}
