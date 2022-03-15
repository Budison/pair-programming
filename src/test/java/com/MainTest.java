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
}

