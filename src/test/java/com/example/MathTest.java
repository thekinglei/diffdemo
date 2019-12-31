package com.example;

import org.junit.Assert;
//import org.junit.Test
import static org.junit.Assert.*;

public class MathTest {

    @org.junit.Test
    public void multiply() {
        Math math = new Math();
        int result = math.multiply(1, 1);
        Assert.assertEquals("multiply test error", 1, result);
    }

    @org.junit.Test
    public void add() {
        Math math = new Math();
        int result = math.add(1, 1);
        Assert.assertEquals("add test error", 2, result);
    }

}
