package linkedlist;

import datastructure.LinkedList;

/**
 * Created by aw186034 on 6/23/17.
 */
public class IntegerAdd {

    public LinkedList<Integer> add(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        int carry = 0;

        LinkedList<Integer> result = new LinkedList<>();
        while (list1.length() > 0 && list2.length() > 0) {
            int sum = list1.remove(0) + list2.remove(0);
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;

            result.add(sum);
        }

        LinkedList<Integer> list = list1.length() != 0 ? list1 : list2;

        while (list.length() > 0) {
            int sum = list.remove(0);
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;

            result.add(sum);
        }

        if (carry != 0) result.add(carry);

        return result;
    }
}
