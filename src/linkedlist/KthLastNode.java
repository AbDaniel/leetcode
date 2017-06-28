package linkedlist;

import datastructure.LinkedList;

/**
 * Created by aw186034 on 6/27/17.
 */
public class KthLastNode {

    public int findKthLastNode(LinkedList<Integer> list, int K) {
        int length = list.length();

        return list.get(length - K);
    }
}
