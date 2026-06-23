package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator cal = new Calculator();
        int res = cal.add(10,20);
        assertEquals(30,res);

    }
}