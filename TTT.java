public class TTT{
    private char board[][];     // state of the game
    private char currPlayer;    //holds x or o player

    final int row = 3;
    final int col = 3;

    TTT(){
        currPlayer = 'o';
    }
    
    // initializing the board setting all val to nothing
    public void initializeBoard(){
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                board[i][j] = '-';
            }
        }
    }

    public boolean isBoardFull(){
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (board[i][j] == '-'){
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard(){
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    // checking if a certain player won
    public boolean checkForwins(){
        if (checkRowWin() || checkColWin() || checkDiagonalWin()){
            return true;
        }
        else{
            return false;
        }
    }

    // checking if a row has the same symbols
    public boolean checkRowWin(){
        for(int i=0; i<row; i++){
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true){
                return true;
            }
        }
        return false;
    }

    //checking if a column has the same symbols
    public boolean checkColWin(){
        for(int j=0; j<col; j++){
            if (checkRowCol(board[0][j], board[1][j], board[2][j]) == true){
                return true;
            }
        }
        return false;
        
    }

    // checking if a diagonal has the same symbols
    public boolean checkDiagonalWin(){
        if (checkRowCol(board[0][0], board[1][1], board[2][2]) == true){
            return true;
        }
        else if(checkRowCol(board[2][0], board[1][1], board[0][2]) == true){
            return true;
        }
        return false;

    }

    public boolean checkRowCol(char board1, char board2, char board3){
        if (board1 == 'o' && board2 == 'o' && board3 == 'o'){
            return true;
        }
        else if(board1 == 'x' && board2 == 'x' && board3 == 'x'){
            return true;
        }
        return false;

    }

    public void changePlayer()

}
