package com.sinha.ritwiz;

import java.util.ArrayList;
import java.util.Scanner;

public class GameLoop {
    Scanner sc;
    GameBoard g;
    ArrayList<Player> p;

    GameLoop(Scanner sc) {
        this.sc = sc;
    }
    void init() {
        System.out.println("Enter board size");
        int size = sc.nextInt();
        g = new GameBoard(size);

        System.out.println("Enter number of players");
        int players = sc.nextInt();
        for(int i = 0; i < players; i++) {
            String name = sc.next();
            Character symbol = sc.next().charAt(0);
            p.add(new Player(name, symbol));
        }
    }
    void loop() {
        Player winner = null;
        int playerTurn = 0;
        int players = p.size();
        while(g.boardFilled() || winner == null) {
            System.out.println(p.get(playerTurn).getName() + ": Enter your move");
            int x = sc.nextInt(), y = sc.nextInt();
            g.fillCell(x, y, p.get(playerTurn));
            g.printBoard();
            playerTurn = (playerTurn + 1) % players;
            winner = g.someoneHasWon();
        }
        if (winner == null) {
            System.out.println("Nobody won");
        } else {
            System.out.println(winner.getName() + ": Has won");
        }

    }
}
