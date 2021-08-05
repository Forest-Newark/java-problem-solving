package com.problems.app.data.structures.linkedlist;

/**
 * ScrachLinkedList
 *
 * A "from scratch" implementation of a Singly Linked List
 */
public class ScratchLinkedList {
    // Head of List
    Node head;

    // Linked List Node class.
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(Node node) {
            this.next = node;
        }
    }

    /**
     * Insert
     * @param list
     * @param data
     * @return
     */
    public ScratchLinkedList insert(ScratchLinkedList list, int data){

        // Create new Node
        Node newNode = new Node(data);
        // Check if the list is empty
        if(list.head == null) {
            // List is empty, assign node as head.
            list.head = newNode;
        } else {
            // List is not empty. Assign currentNode as the first(head) node.
            Node currentNode = list.head;
            // Traverse the list to find the last node.
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            //Assign new node to the end of the list
            currentNode.setNext(newNode);
        }
        // Return list
        return list;
    }

    public void printList(ScratchLinkedList list) {
        Node currentNode = list.head;

        System.out.println("ScratchLinkedList: ");

        while(currentNode.next != null) {
            // Print Data
            System.out.print(currentNode.data + " ");
            // Assign current node to the next node;
            currentNode = currentNode.next;
        }
    }

    /**
     * Size of list
     * @param list
     * @return
     */
    public int size(ScratchLinkedList list) {
        int listSize = 0;
        if(list.head != null) {
            Node currentNode = list.head;
            while(currentNode != null) {
                listSize++;
                currentNode = currentNode.next;
            }
        }
        return listSize;
    }

    /**
     * Print the Middle Node.
     * Uses fast point and slow pointer to determine middle
     * @param list
     */
    public Node findMiddleNode(ScratchLinkedList list) {
        Node middleNode = null;
        if(list != null) {
            Node fastPointer = list.head;
            Node slowPointer = list.head;
            while(fastPointer != null && fastPointer.next != null) {
                fastPointer = fastPointer.next.next;
                slowPointer = slowPointer.next;
                middleNode = slowPointer;
            }
        }
        return middleNode;
    }
}
