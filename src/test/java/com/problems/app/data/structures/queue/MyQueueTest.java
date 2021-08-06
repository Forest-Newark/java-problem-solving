package com.problems.app.data.structures.queue;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyQueueTest {

    @Test
    public void testIsEmptyTrue() {
        MyQueue myQueue = new MyQueue();
        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void testIsEmptyFalse() {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        assertFalse(myQueue.isEmpty());
    }

    @Test
    public void testPrintMyQueue() {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.printMyQueue();
    }


}
