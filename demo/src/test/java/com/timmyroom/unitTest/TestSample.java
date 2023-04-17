package com.timmyroom.unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.timmyroom.logicsample.Calculator;


public class TestSample {
    private Calculator calculator = new Calculator();

    @Test
    public void testCalc() {
        int addRes = calculator.add(5, 3);
        int subRes = calculator.sub(7, 2);
        float mulRes = calculator.mul(5, 5);
        float divRes = calculator.div(8, 2);
        
        assertEquals(5, addRes);
        assertEquals(5, subRes);
        assertEquals(25, mulRes);
        assertEquals(4, divRes);
    }
}