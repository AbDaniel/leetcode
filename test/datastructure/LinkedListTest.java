package datastructure;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aw186034 on 6/23/17.
 */
public class LinkedListTest {
    @Test
    public void removeIndex() throws Exception {
        LinkedList<Character> list = new LinkedList<>();

        list.addToTail('a');
        list.addToTail('b');
        list.addToTail('c');
        list.addToTail('d');
        list.addToTail('e');

        // delete at head
        Character actual = list.remove(0);
        assertEquals((Character) 'a', actual);
        assertEquals("b->c->d->e", list.toString());

        // mid
        actual = list.remove(1);
        assertEquals((Character) 'c', actual);
        assertEquals("b->d->e", list.toString());

        // not presnt
        actual = list.remove(2);
        assertEquals((Character) 'e', actual);
        assertEquals("b->d", list.toString());
    }

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
        assertTrue(list.remove((Character) 'a'));
        assertEquals("b->c->d->e", list.toString());

        // mid
        assertTrue(list.remove((Character) 'c'));
        assertEquals("b->d->e", list.toString());

        // not presnt
        assertFalse(list.remove((Character) 'c'));
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