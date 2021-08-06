package com.problems.app.data.structures.queue;

/**
 * MyQueue Implementation
 * (FIFO)
 */
public class MyQueue {

    Node head;
    Node tail;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int peak() throws NullPointerException {
        return this.head.data;
    }

    // Add Data to Tail
    public void add (int data) {
        Node newNode = new Node(data);

        if(tail != null) {
            this.tail.next = newNode;
        }

        this.tail = newNode;

        if(head == null) {
            this.head = newNode;
        }
    }

    // Remove Data From Head
    public int remove() {
        int removedData = this.head.data;
        this.head = this.head.next;
        if(head == null) {
            this.tail = null;
        }
        return removedData;
    }

    public void printMyQueue() {
        System.out.println("\n Printing MyQueue");
        if(!this.isEmpty()) {
            System.out.print("[ ");
            Node currentNode = this.head;
            while(currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.print("]");
        }else {
           System.out.print("Queue is Empty");
        }
    }

}
