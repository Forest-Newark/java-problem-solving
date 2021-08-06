package com.problems.app.data.structures.linkedlist;

import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void testAppendLinkedList() {
        MyLinkedList list = new MyLinkedList();
        list.printList(list);
        list.append(list, 1);
        list.printList(list);
        list.append(list,2);
        list.append(list,3);
        list.printList(list);
    }

    @Test
    public void testPrependLinkedList() {
        MyLinkedList list = new MyLinkedList();
        list.append(list, 1);
        list.append(list, 2);
        list.append(list, 3);
        list.printList(list);
        list.prepend(list,99);
        list.printList(list);
    }

    @Test
    public void testDeleteByValue() {
        MyLinkedList list = new MyLinkedList();
        list.append(list, 1);
        list.append(list, 2);
        list.append(list, 3);
        list.printList(list);
        list.deletedByValue(list, 2);
        list.printList(list);

    }
}
