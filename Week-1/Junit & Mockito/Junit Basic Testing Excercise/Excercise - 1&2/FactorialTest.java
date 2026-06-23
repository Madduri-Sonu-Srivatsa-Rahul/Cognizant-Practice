package org.example;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @org.junit.jupiter.api.Test
    public void testGetFactorial() {
        Factorial fact = new Factorial();
        int res = fact  .getFactorial(4);

        assertEquals(24,res);
    }
}