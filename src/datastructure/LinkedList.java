package datastructure;

public class LinkedList<T> {

    private ListNode<T> head;

    public LinkedList(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    public void add(T data) {
        addToTail(data);
    }

    public void addToTail(T data) {
        ListNode<T> nodeTobeInserted = new ListNode<>(data);
        if (head == null) head = nodeTobeInserted;
        else {
            ListNode<T> tempHead = head;
            while (tempHead.next != null) tempHead = tempHead.next;

            tempHead.next = nodeTobeInserted;
        }
    }

    public void addToHead(T data) {

    }

    public boolean remove(T data) {
        if (head == null) return false;
        if (head.data == data) {
            head = head.next;
            return true;
        }

        ListNode<T> currNode = head.next;
        ListNode<T> parent = head;

        while (currNode.next != null && currNode.data != data) {
            parent = currNode;
            currNode = currNode.next;
        }

        if (currNode.next == null && currNode.data != data) return false;
        parent.next = currNode.next;

        return true;
    }

    public T remove(int index) {
        if (head == null) throw new RuntimeException("Empty list");
        if (index >= length()) throw new IndexOutOfBoundsException();

        if (index == 0) {
            T result = head.data;
            head = head.next;

            return result;
        }


        ListNode<T> currNode = head;
        ListNode<T> parentNode = null;

        for (int i = 0; i <= index - 1; i++) {
            parentNode = currNode;
            currNode = currNode.next;
        }

        T result = currNode.data;
        parentNode.next = currNode.next;
        return result;
    }

    public int length() {
        int length = 0;

        ListNode<T> tempHead = head;
        while (tempHead != null) {
            length += 1;
            tempHead = tempHead.next;
        }

        return length;
    }


    @Override
    public String toString() {
        StringBuilder br = new StringBuilder("");

        ListNode<T> tempHead = this.head;

        while (tempHead != null) {
            if (tempHead.next != null)
                br.append(tempHead.data).append("->");
            else
                br.append(tempHead.data);

            tempHead = tempHead.next;
        }

        return br.toString();
    }
}
