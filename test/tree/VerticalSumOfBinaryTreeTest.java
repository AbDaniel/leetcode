package tree;

import datastructure.BinaryTreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by daniel on 7/12/17.
 */
public class VerticalSumOfBinaryTreeTest {
    @Test
    public void sum() throws Exception {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);

        root.left = new BinaryTreeNode<>(2);
        root.right = new BinaryTreeNode<>(3);


        root.left.left = new BinaryTreeNode<>(4);
        root.left.right = new BinaryTreeNode<>(5);

        root.right.left = new BinaryTreeNode<>(6);
        root.right.right = new BinaryTreeNode<>(7);

        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(2);
        list.add(12);
        list.add(3);
        list.add(7);

        List<Integer> actual = new VerticalSumOfBinaryTree().sum(root);

        assertEquals(list, actual);
    }

}