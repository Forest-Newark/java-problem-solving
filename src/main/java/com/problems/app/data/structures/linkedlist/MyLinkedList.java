package com.problems.app.data.structures.linkedlist;

public class MyLinkedList {
    Node head;

    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    /**
     * Append Data to End of MyLinkedList
     * @param list
     * @param data
     * @return
     */
    public MyLinkedList append(MyLinkedList list, int data) {

        if(list != null) {
            // Handle Null Head Scenario
            if(list.head == null) {
                // Assign List Head as new node
                list.head = new Node(data);
                // Return  Data;
                return list;
            }
            // Assign current Node as list head
            Node currentNode = list.head;
            // Iterate over nodes until next is null;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            // Assign current node next pointer to a new Node
            currentNode.next = new Node(data);
        }
        // Return the list
        return list;
    }

    /**
     * Prepend Data to Start of MyLinkedList
     * @param list
     * @param data
     * @return
     */
    public MyLinkedList prepend(MyLinkedList list, int data) {
        if(list != null) {
            // Handle Null Head Scenario
            if(list.head == null) {
                list.head = new Node(data);
                return list;
            }

            // Get Reference to head Node
            Node oldHeadNode = list.head;

            // Reassign Head to new node
            list.head = new Node(data);

            // Set next reference to HeadNode
            list.head.next = oldHeadNode;

            // Return the list
            return list;
        }
        // Return null input if list is null
        return list;
    }

    /**
     * Delete By Value.
     * @param list
     * @param data
     * @return
     */
    public MyLinkedList deletedByValue(MyLinkedList list, int data) {

        // Check for null list
        if(list != null) {
            // Handle case if value is head
            if(list.head.data == data) {
                // Reassign list head to the next item in list
                list.head = list.head.next;
                return list;
            }
            Node currentNode = list.head;
            // Iterate until either current node is null or the data is a match
            while (currentNode.next != null) {
                // If the next node data is a match, remove it.
                if(currentNode.next.data == data) {
                    currentNode.next = currentNode.next.next;
                }
                currentNode = currentNode.next;
            }
        }
        return list;
    }

    /**
     * Print MyLinkedList
     * @param list
     */
    public void printList(MyLinkedList list) {
        MyLinkedList.Node currentNode = list.head;

        System.out.println("\n ScratchLinkedList: ");
        if(currentNode != null) {
            while(currentNode.next != null) {
                // Print Data
                System.out.print(currentNode.data + " ");
                // Assign current node to the next node;
                currentNode = currentNode.next;
            }
            // Print last node
            System.out.print(currentNode.data + " \n");
        }

    }

}
