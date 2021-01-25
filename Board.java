package minesweeper;

public class Board {
    private Tile [][] gameBoard;

    public Board() {
        int size=10;
        gameBoard=new Tile[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameBoard[i][j] = new Tile();
            }
        }
    }
}
