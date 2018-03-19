package datastructure.hashtable.singlelist;

import datastructure.hashtable.Pair;

public class Node {
    private Pair pair;
    private Node next;

    public Node(Pair pair) {
        this.pair = pair;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Pair getPair() {
        return pair;
    }
}
