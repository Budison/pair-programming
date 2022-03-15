package com;

public class Cell {
    boolean isAlive;
    int neighbours;

    public Cell(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Cell(boolean isAlive, int neighbours) {
        this.isAlive = isAlive;
        this.neighbours = neighbours;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int neighbours() {
        return this.neighbours;
    }

    public boolean shouldStayAlive() {
        return this.neighbours == 2 || this.neighbours == 3;
    }
}
