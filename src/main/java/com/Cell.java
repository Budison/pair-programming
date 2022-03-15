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

    public boolean resurrected() {
        return !this.isAlive && this.neighbours == 3;
    }

    public void updateNeightbour(int i) {
        this.neighbours = i;
    }

    public void trigger() {
        this.isAlive = !this.isAlive;
    }
}
