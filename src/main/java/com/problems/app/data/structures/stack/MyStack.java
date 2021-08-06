package com.problems.app.data.structures.stack;

import com.problems.app.data.structures.queue.MyQueue;

/**
 * MyStack Implementation
 */
public class MyStack {

    Node top;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * IsEmpty
     * @return
     */
    public boolean isEmpty() {
        return this.top == null;
    }

    /**
     * Peak
     * @return
     * @throws NullPointerException
     */
    public int peak() throws NullPointerException {
        return top.data;
    }

    /**
     * Push
     * @param data
     */
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            this.top = newNode;
        } else {
            Node oldTop = this.top;
            this.top = newNode;
            this.top.next = oldTop;
        }

    }

    /**
     * Pop
     * @return
     * @throws NullPointerException
     */
    public int pop() throws NullPointerException {
        // Get Data from current Top
        int removedData = top.data;
        // Reassign top value to the next value in stack
        this.top = top.next;
        // Return removed data
        return removedData;
    }

    public void printMyStack() {
        System.out.println("\n Printing MyStack");
        if(!this.isEmpty()) {
            System.out.print("[ ");
            Node currentNode = this.top;
            while(currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.print("]");
        }else {
            System.out.print("Stack is Empty");
        }
    }


}
