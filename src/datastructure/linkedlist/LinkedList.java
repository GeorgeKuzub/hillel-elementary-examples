package datastructure.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public Node find(String data) {
        Node currentNode = head;

        {
            if (currentNode.getData().equals(data)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        } while (currentNode != null);

        return null;

    }

    public boolean contain(String data) {
        return (find(data) != null);
    }


    public void insertBefore(String data) {
        Node currentNode = new Node(data);
        head.setPrev(currentNode);
        currentNode.setNext(head);
        head = currentNode;
    }

    public void insertAfter(String data) {
        Node newlyAddedNode = new Node(data);

        if (head == null) {
            head = newlyAddedNode;
            tail = head;
            return;
        }


        newlyAddedNode.setPrev(tail);
        tail.setNext(newlyAddedNode);

        tail = newlyAddedNode;


    }

    public void remove(String data) {
        Node removingNode = find(data);
        remove(removingNode);

    }

    public void remove(Node removingNode) {
        if (removingNode == null) {
            System.out.println("Warning: Removing element has not been found.");
            return;
        }

        if (removingNode == head) {
            Node currentNode = head.getNext();
            head.setNext(null);
            head = currentNode;
            currentNode.setPrev(null);
            return;
        }

        if (removingNode == tail) {
            Node currentNode = tail.getPrev();
            tail.setPrev(null);
            tail = currentNode;
            currentNode.setNext(null);
            return;
        }

        Node leftNode = removingNode.getPrev();
        Node rightNode = removingNode.getNext();
        removingNode.setPrev(null);
        removingNode.setNext(null);
        leftNode.setNext(rightNode);
        rightNode.setPrev(leftNode);

    }

}
