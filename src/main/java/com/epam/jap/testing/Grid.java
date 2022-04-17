package com.epam.jap.testing;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    List<Cell> cellList = new ArrayList<>();

    public void addCell(Cell addCell) {
        cellList.add(addCell);
    }

    public int amountOfElements() {
        return cellList.size();
    }
}
