package datastructure.linkedlist;

public class Node {
    private String data;
    private Node prev;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }
}
