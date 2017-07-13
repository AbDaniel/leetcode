package datastructure;

/**
 * Created by daniel on 7/12/17.
 */
public class BinaryTreeNode<T> {
    public T value;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T value) {
        this.value = value;
    }
}
