package com.company;

public class Knight extends Piece {
    public Knight(Position position, int color) {
        this.position = position;
        this.color = color;
    }

    @Override
    public boolean isValidMove(Position newPosition, Cell[][] board) {
        return false;
    }

    @Override
    public String toString() {
        return "N";
    }
}
