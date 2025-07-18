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
        short actual = this.calc.sum((short)10,(short)2);
        Assertions.assertEquals(12,actual);
    }

    @Test
    public void testSumLong(){
        long actual = this.calc.sum((long) 10,(long) 2);
        Assertions.assertEquals(12,actual, 0.0001);
    }

    @Test
    public void testDiffInt(){
        int actual = this.calc.difference(5,3);
        Assertions.assertEquals(2,actual);
    }
    @Test
    public void testDiffDouble(){
        double actual = this.calc.difference(5,3);
        Assertions.assertEquals(2,actual);
    }
    @Test
    public void testDiffFloat(){
        float actual = this.calc.difference(5f,3f);
        Assertions.assertEquals(2f,actual);
    }
    @Test
    public void testDiffLong(){
        long actual = this.calc.difference(5,3);
        Assertions.assertEquals(2,actual,0.0001);
    }
    @Test
    public void testDiffShort(){
        short actual = (short) this.calc.difference(5,3);
        Assertions.assertEquals(2,actual);
    }

    @Test
    void productInt(){
        int actual = this.calc.product(5,5);
        Assertions.assertEquals(25,actual);
    }
    @Test
    void productDouble(){
        double actual = this.calc.product(5,5);
        Assertions.assertEquals(25,actual);
    }
    @Test
    void productFloat(){
        float actual = this.calc.product(5f,5f);
        Assertions.assertEquals(25f,actual);
    }
    @Test
    void productLong(){
        long actual = this.calc.product(5,5);
        Assertions.assertEquals(25,actual);
    }
    @Test
    void productShort(){
        short actual = (short) this.calc.product(5,5);
        Assertions.assertEquals(25,actual);
    }

    @Test
    void quotientInt(){
        int actual = this.calc.quotient(5,3);
        Assertions.assertEquals(5/3,actual,0.001);
    }

    @Test
    void quotientDouble(){
        double actual = this.calc.quotient(5d,3d);
        Assertions.assertEquals(((double) 5/3),actual,0.001);
    }
    @Test
    void quotientFloat(){
        float actual = this.calc.quotient(5f,3f);
        Assertions.assertEquals(((float) 5/3),actual,0.001);
    }
    @Test
    void quotientShort(){
        short actual = (short) this.calc.quotient(5,3);
        Assertions.assertEquals(((short) 5/3),actual,0.001);
    }
    @Test
    void quotientLong(){
        long actual = this.calc.quotient((long)5,(long)3);
        Assertions.assertEquals(((long) 5/3),actual,0.001);
    }







}


