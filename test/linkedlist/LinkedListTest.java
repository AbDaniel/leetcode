package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aw186034 on 6/23/17.
 */
public class LinkedListTest {
    @Test
    public void length() throws Exception {
        LinkedList<Character> list = new LinkedList<>();

        list.addToTail('a');
        list.addToTail('b');
        list.addToTail('c');
        list.addToTail('d');
        list.addToTail('e');

        assertEquals(5, list.length());

        assertEquals(0, new LinkedList<>().length());
    }

    @Test
    public void remove() throws Exception {
        LinkedList<Character> list = new LinkedList<>();

        list.addToTail('a');
        list.addToTail('b');
        list.addToTail('c');
        list.addToTail('d');
        list.addToTail('e');

        // delete at head
        assertTrue(list.remove('a'));
        assertEquals("b->c->d->e", list.toString());

        // mid
        assertTrue(list.remove('c'));
        assertEquals("b->d->e", list.toString());

        // not presnt
        assertFalse(list.remove('c'));
        assertEquals("b->d->e", list.toString());

    }

    @org.junit.Test
    public void addToTail() throws Exception {
        LinkedList<Character> list = new LinkedList<>();

        list.addToTail('a');
        list.addToTail('b');
        list.addToTail('c');
        list.addToTail('d');
        list.addToTail('e');

        System.out.println(list);
    }

}