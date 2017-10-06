package datastructure.linkedlist;

import sun.awt.image.ImageWatched;

import java.util.Iterator;

public class Start {


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAfter("aa");
        linkedList.insertAfter("bb");
        linkedList.insertAfter("cc");
        linkedList.insertAfter("dd");
        linkedList.insertAfter("ee");

        showListWithIterator(linkedList);


//        showLinkedList(linkedList);
//
//        linkedList.remove("ee");
//        showLinkedList(linkedList);
//
//        linkedList.remove("aa");
//        showLinkedList(linkedList);
//
//        linkedList.remove("cc");
//        showLinkedList(linkedList);
//
//        linkedList.insertBefore("00");
//        showLinkedList(linkedList);


//        linkedList.remove("ee");
//        showListWithIterator(linkedList);
//
//        linkedList.remove("aa");
//        showListWithIterator(linkedList);
//
//        linkedList.remove("cc");
//        showListWithIterator(linkedList);
//
//        linkedList.insertBefore("00");
//        showListWithIterator(linkedList);
    }

//    public static void showLinkedList(LinkedList linkedList) {
//        Node currentNode = linkedList.getHead();
//        while (currentNode != null) {
//            System.out.println(currentNode.getData());
//            currentNode = currentNode.getNext();
//        }
//        System.out.println();
//    }

    public static void showListWithIterator(LinkedList linkedList) {
        Iterator<Node> iterator = linkedList.iterator();

        System.out.println("While approach:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getData() + "; ");
        }

        System.out.println();

//        System.out.println("The same, but only <foreach> approach:");
//        for (Node element : linkedList) {
//            System.out.println(element.getData());
//        }
    }
}
