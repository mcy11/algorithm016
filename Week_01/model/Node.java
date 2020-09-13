package model;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-13 14:25
 */
public class Node {

    public int val;

    public Node pre, next;

    public Node(int val) {
        this.val = val;
        this.pre = null;
        this.next = null;
    }
}
