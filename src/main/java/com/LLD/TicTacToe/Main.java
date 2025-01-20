package com.LLD.TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> list=new ArrayList<>();
        Player one=new Player("Tom",new Piece(PieceType.Circle));
        Player two=new Player("Dom",new Piece(PieceType.Square));
        list.add(one);
        list.add(two);

        Board board=new Board(3);

        Game game=new Game(board,list);

        game.startGame();

    }
}
