package datastructure.linkedlist;

import sun.awt.image.ImageWatched;

public class Start {


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAfter("aa");
        linkedList.insertAfter("bb");
        linkedList.insertAfter("cc");
        linkedList.insertAfter("dd");
        linkedList.insertAfter("ee");

        showLinkedList(linkedList);

        linkedList.remove("ee");
        showLinkedList(linkedList);

        linkedList.remove("aa");
        showLinkedList(linkedList);

        linkedList.remove("cc");
        showLinkedList(linkedList);

        linkedList.insertBefore("00");
        showLinkedList(linkedList);
    }

    public static void showLinkedList(LinkedList linkedList) {
        Node currentNode = linkedList.getHead();
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }
}
