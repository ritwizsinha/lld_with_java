package com.sinha.ritwiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        GameLoop  g= new GameLoop(sc);
        g.init();
        g.loop();
    }
}
