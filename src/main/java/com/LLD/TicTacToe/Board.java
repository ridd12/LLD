package com.LLD.TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int n;
    List<List<Piece>> boardList=new ArrayList<>();

    Board(int z){
        this.n=z;
        for(int i=0;i<z;i++){
            List<Piece> list=new ArrayList<>();
            for(int j=0;j<z;j++){
                list.add(new Piece(PieceType.Dot));
            }
            boardList.add(list);
        }
    }

}
