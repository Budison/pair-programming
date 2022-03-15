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


}

