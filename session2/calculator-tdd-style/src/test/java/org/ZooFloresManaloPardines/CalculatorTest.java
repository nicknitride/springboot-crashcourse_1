package org.ZooFloresManaloPardines;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc;
    @BeforeEach
    void setup(){
        calc = new Calculator();
    }

    @Test
    public void testSumInt(){
        int actual = calc.sum(10,2);
        Assertions.assertEquals(12,actual);
    }

    @Test
    public void testSumDouble(){
        double actual = this.calc.sum(10.0d,2.0d);
        Assertions.assertEquals(12d,actual, 0.0001);
    }

    @Test
    public void testSumFloat(){
        float actual = this.calc.sum(10.0f,2.0f);
        Assertions.assertEquals(12f, actual, 0.0001);
    }

    @Test
    public void testSumShort(){
        short actual = (short) this.calc.sum(10,2);
        Assertions.assertEquals(12,actual, 0.0001);
    }

    @Test
    public void testSumLong(){
        long actual = this.calc.sum(10,2);
        Assertions.assertEquals(12,actual, 0.0001);
    }




}


