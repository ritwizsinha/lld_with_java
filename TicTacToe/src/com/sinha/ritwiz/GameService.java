package com.sinha.ritwiz;

public class GameService {
    GameBoard board;
    PlayerSwitcher consecutiveSwitcher;

    public GameService() {
    }

    public int move(Integer x, Integer y) {
        if (this.consecutiveSwitcher == null || this.board == null) {
            return -1;
        }
        Player currentPlayer = consecutiveSwitcher.currentPlayer();
        board.fillCell(x, y, currentPlayer);
        if (board.someoneHasWon() != null) {
            System.out.println(currentPlayer.getName() + "Has won");
            return 1;
        }
        consecutiveSwitcher.switchPlayer();
        return 0;
    }

    public void addSwitcher(PlayerSwitcher switcher) {
        this.consecutiveSwitcher = switcher;
    }

    public  void createNewGame(int boardSize) {
        this.board = new GameBoard(boardSize);
    }

    public  void endGame(){
        System.out.println("ending game");
    }
}
