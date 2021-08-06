package com.problems.app.data.structures.stack;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyStackTest {

    @Test
    public void testIsEmptyTrue() {
        MyStack myStack = new MyStack();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testIsEmptyFalse() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void testPrintMyStack() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.printMyStack();
    }

    @Test
    public void testPushToMyStack() {
        MyStack myStack = new MyStack();
        myStack.printMyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.printMyStack();
    }

    @Test
    public void testPopMyStack() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.printMyStack();
        myStack.pop();
        myStack.printMyStack();
    }

}
