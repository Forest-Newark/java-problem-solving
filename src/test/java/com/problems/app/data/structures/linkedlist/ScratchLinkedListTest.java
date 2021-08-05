package com.problems.app.data.structures.linkedlist;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScratchLinkedListTest {

    @Test
    public void testCanCreateScratchLinkedList() {
        ScratchLinkedList list = new ScratchLinkedList();
        assertNotNull(list);
    }

    @Test
    public void testCanInsertToScrachLinkedList(){
        ScratchLinkedList list = new ScratchLinkedList();
        list.insert(list, 1);
        list.insert(list,2);
        list.insert(list, 3);
        assertTrue(list.size(list) == 3);
    }

    @Test
    public void testCanFindMiddleNode(){
        ScratchLinkedList list = new ScratchLinkedList();
        list.insert(list, 1);
        list.insert(list,2);
        list.insert(list, 3);
        list.insert(list, 4);
        list.insert(list, 5);
        list.insert(list, 6);
        list.insert(list, 7);
        list.insert(list, 8);
        list.insert(list, 9);

        ScratchLinkedList.Node middleNode = list.findMiddleNode(list);
        assertTrue(middleNode.data == 5);
    }


}
