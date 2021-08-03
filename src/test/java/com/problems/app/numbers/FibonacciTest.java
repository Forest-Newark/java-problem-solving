package com.problems.app.numbers;

import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        // Setup
        List<BigInteger> expected = new ArrayList<>();
        expected.add(BigInteger.valueOf(0));
        expected.add(BigInteger.valueOf(1));
        expected.add(BigInteger.valueOf(1));
        expected.add(BigInteger.valueOf(2));
        expected.add(BigInteger.valueOf(3));
        expected.add(BigInteger.valueOf(5));
        expected.add(BigInteger.valueOf(8));
        expected.add(BigInteger.valueOf(13));
        expected.add(BigInteger.valueOf(21));
        expected.add(BigInteger.valueOf(34));
        expected.add(BigInteger.valueOf(55));
        expected.add(BigInteger.valueOf(89));
        expected.add(BigInteger.valueOf(144));

        // Execute
        List<BigInteger> result = Fibonacci.createFibonacciSequence(13);

        // Validate
        assertTrue(expected.containsAll(result));

    }


    @Test
    public void testCalculateFibonacciNumber() {
        // Setup
        BigInteger expected = new BigInteger("12586269025");
        // Execute
        BigInteger result = Fibonacci.calFib(50);
        // Valdate
        assertTrue(expected.equals(result));
    }

}
