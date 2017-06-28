package linkedlist;

import datastructure.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aw186034 on 6/27/17.
 */
public class KthLastNodeTest {
    @Test
    public void findKthLastNode() throws Exception {
        LinkedList<Integer> list1 = new LinkedList<>(2, 4, 3, 7, 5, 10);

        int actual = new KthLastNode().findKthLastNode(list1, 3);
        int expected = 7;

        assertEquals(7, 7);
    }

}