package ru.vsu.cs.raspopov.chess.essence.pieces;

import javafx.scene.paint.Color;

public class King extends Piece {

    public King(Color color, String pos) {
        super(color, pos, "K");
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public void move() {

    }

    @Override
    public void drawPiece() {

    }

}
