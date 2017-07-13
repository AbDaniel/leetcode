package tree;

import datastructure.BinaryTreeNode;

import java.util.*;

/**
 * Created by daniel on 7/12/17.
 */
public class VerticalSumOfBinaryTree {


    public List<Integer> sum(BinaryTreeNode<Integer> node) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        LinkedList<Tuple> queue = new LinkedList<>();

        Tuple firstNode = new Tuple(node, 0);
        queue.add(firstNode);

        while(!queue.isEmpty()) {
            Tuple curr = queue.pop();
            if(curr.node.left != null) {
                queue.add(new Tuple(curr.node.left, curr.lineNo - 1));
            }
            if (curr.node.right != null) {
                queue.add(new Tuple(curr.node.right, curr.lineNo + 1));
            }

            if(map.containsKey(curr.lineNo)) {
                map.put(curr.lineNo, map.get(curr.lineNo) + curr.node.value);
            } else {
                map.put(curr.lineNo, curr.node.value);
            }
        }

        List<Integer> solution = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            solution.add(entry.getValue());
        }
        return solution;
    }

    class Tuple {
        BinaryTreeNode<Integer> node;
        int lineNo;

        Tuple(BinaryTreeNode<Integer> node, int lineNo) {
            this.node = node;
            this.lineNo = lineNo;
        }
    }
}
