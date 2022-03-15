package com;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class MainTest {

    @Test
    public void test() {
        Cell cell_alive = new Cell(true);
        Cell cell_dead = new Cell(false);
        Assert.assertTrue(cell_alive.isAlive());
        Assert.assertFalse(cell_dead.isAlive());
    }

    @Test
    public void test2() {
        Cell cell = new Cell(false, 5);
        Assert.assertEquals(cell.neighbours(), 5);
    }
    @Test
    public void test3() {
        Cell cell = new Cell(true,3);
        Assert.assertTrue(cell.shouldStayAlive());
    }
    @Test
    public void test4() {
        Cell cell = new Cell(false, 3);
        Assert.assertTrue(cell.resurrected());
    }
    @Test
    public void test5() {
        Cell cell = new Cell(true, 6);
        Assert.assertFalse(cell.shouldStayAlive());
    }
    @Test
    public void test6() {
        Cell cell = new Cell(true, 1);
        cell.updateNeightbour(7);
        Assert.assertEquals(cell.neighbours(), 7);
    }

    @Test
    public void test7() {
        Cell cell = new Cell(false, 3);
        cell.trigger();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(cell.isAlive());
        cell.trigger();
        sa.assertFalse(cell.isAlive());
        sa.assertAll();
    }

    @Test
    public void test8() {
        Cell[][] cells = new Cell[3][3];

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(false,0);
            }
        }
        SoftAssert sa = new SoftAssert();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
               Assert.assertFalse(cells[i][j].isAlive());
            }
        }
        sa.assertAll();
    }
    @Test
    public void testCompareToCell() {
        Cell cell1 = new Cell(true, 3);
        Cell cell2 = new Cell(true, 3);
        Cell cell3 = new Cell(true, 2);
        assertTrue(cell1.compareToCell(cell2));
        assertFalse(cell1.compareToCell(cell3));
    }

    @Test
    public void testIfGridIsNotEmpty() {
        Grid gird = new Grid();
    }
}

