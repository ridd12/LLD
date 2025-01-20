package com.LLD.TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Game {

    Board board;
    List<Player> players;

    Game(Board board,List<Player> players){
        this.board=board;
        this.players=players;
    }

    public void startGame(){
        System.out.println("Game has started");
    }

}
