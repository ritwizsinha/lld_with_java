package com.sinha.ritwiz;

public class GameBoard {
    Player[][] gameBoard;
    int size;
    int totalMoves;
    public GameBoard(int s) {
        size = s;
        gameBoard = new Player[s][s];
        totalMoves = 0;
    }

    public void fillCell(int x, int y, Player p) {
        if (gameBoard[x][y] != null) {
            System.out.println("Already occupied");
            return;
        }
        totalMoves++;
        gameBoard[x][y] = p;
    }
    public void printBoard() {
        for(int i = 0; i < size; i++) {
            for(int j = 0 ; j < size; j++) System.out.printf("%c ", gameBoard[i][j].getSymbol());
            System.out.print("\n");
        }
    }
    public boolean boardFilled() {
        return this.totalMoves == size * size;
    }
    public Player someoneHasWon() {
        Player player = someoneWonRow();
        if (player !=  null) {
            return player;
        }
        player = someoneWonColumn();
       if (player !=  null)  {
           return player;
       }
       player = someoneWonDiagonal();
       if (player != null) {
           return player;
       }
       player = someoneWonAntiDiagonal();
       return player;
    }

    private  Player someoneWonRow() {
        Player winner = null;
        for(int r = 0; r < size; r++) {
            int c= 0;
            for(; c + 1 < size; c++) if (gameBoard[r][c].getSymbol() != gameBoard[r][c+1].getSymbol()) break;
            if (c == size - 1) winner = gameBoard[r][c];
        }

        return winner;
    }
    private Player someoneWonColumn() {
        Player winner = null;
        for(int c = 0; c < size; c++) {
            int r = 0;
            for(; r + 1 < size; r++) if (gameBoard[r][c].getSymbol() != gameBoard[r + 1][c].getSymbol()) break;
            if (r == size-1) winner = gameBoard[r][c];
        }

        return winner;
    }
    private Player someoneWonDiagonal() {
        Player winner = null;
        int x = 0;
        for(; x + 1 < size; x++) if (gameBoard[x][x].getSymbol() != gameBoard[x+ 1][x + 1].getSymbol()) break;
        if (x == size - 1) winner = gameBoard[x][x];

        return winner;
    }

    private Player someoneWonAntiDiagonal() {
        Player winner = null;
        int x = 0;
        for(; x + 1 < size; x++) if (gameBoard[x][size - 1 - x].getSymbol() != gameBoard[x+ 1][size - 1 - x - 1].getSymbol()) break;
        if (x == size - 1) winner = gameBoard[x][size - 1 - x];

        return winner;
    }
}
