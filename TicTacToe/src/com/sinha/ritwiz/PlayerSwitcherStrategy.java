package com.sinha.ritwiz;

public class PlayerSwitcherStrategy extends PlayerSwitcher {
    int toggle;
    Player []players;
    public  PlayerSwitcherStrategy(Player one, Player two) {
        players = new Player[]{one, two};
        toggle = 0;
    }
    @Override
    public void switchPlayer() {
        toggle ^= 1;
    }

    @Override
    public Player currentPlayer() {
       return players[toggle];
    }
}
