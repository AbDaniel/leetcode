package linkedlist;

import datastructure.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aw186034 on 6/23/17.
 */
public class IntegerAddTest {
    @Test
    public void add() throws Exception {
        LinkedList<Integer> list1 = new LinkedList<>(2, 4, 3);
        LinkedList<Integer> list2 = new LinkedList<>(5, 6, 4);

        IntegerAdd add = new IntegerAdd();

        LinkedList<Integer> actual = add.add(list1, list2);

        LinkedList<Integer> expected = new LinkedList<>(7, 0, 8);
        assertEquals(expected, actual);

        list1 = new LinkedList<>(2, 4, 3);
        list2 = new LinkedList<>(9);


        actual = add.add(list1, list2);

        expected = new LinkedList<>(1, 5, 3);
        assertEquals(expected, actual);

        list1 = new LinkedList<>(3);
        list2 = new LinkedList<>(5, 6, 4);


        actual = add.add(list1, list2);

        expected = new LinkedList<>(8, 6, 4);
        assertEquals(expected, actual);

    }

}