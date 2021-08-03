package com.problems.app.numbers;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Fibonacci Sequence Class
 */
public class Fibonacci {

    private static Map<Integer, BigInteger> memo = new HashMap<>();

    /**
     * Create Fibonacci Sequence
     * @param limit
     * @return
     */
    public static List<BigInteger> createFibonacciSequence(int limit) {
        List<BigInteger> fibonacciArray = new ArrayList<>();

        for (int i = 0; i < limit; i++) {
            fibonacciArray.add(calFib(i));
        }
        return fibonacciArray;
    }

    /**
     * Calculate Fibonacci Number
     * @param n
     * @return
     */
    public static BigInteger calFib(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.valueOf(n);
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        BigInteger v = calFib(n - 2).add(calFib(n - 1));
        memo.put(n, v);
        return v;
    }

}
