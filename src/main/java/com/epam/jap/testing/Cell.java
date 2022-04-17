package com.epam.jap.testing;

public class Cell {
    private final boolean isAlive;
    private final int neighbours;
    public Cell(boolean b) {
        this.isAlive = b;
        neighbours = 0;
    }
    public Cell(boolean b, int i) {
        this.isAlive = b;
        this.neighbours = i;
    }
    public boolean isAlive() {
        return isAlive;
    }

    public boolean isAliveNextGeneration() {
        return (neighbours == 3 ? true : false);
    }


    public boolean compareToCell(Cell cell2) {
        return (cell2.isAlive && this.isAlive) && (cell2.neighbours == this.neighbours);
    }
}
