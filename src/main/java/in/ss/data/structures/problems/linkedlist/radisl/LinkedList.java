package in.ss.data.structures.problems.linkedlist.radisl;

import lombok.Data;

/**
 * @author Satyendra Singh
 * @project Data-Structures
 * @package in.ss.data.structures.problems.linkedlist.radisl
 * @date 11-12-2018
 * @time 22:35
 */
public class LinkedList {
    private Node head = null;

    public void insert(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void removeAllOccurence(Node node) {

    }

    public void remove(Node node) {

    }

    public void printListFromRight() {
        traverseFromRight(head);
    }

    private Node traverseFromRight(Node node) {
        //base case
        if (node == null) {
            return node;
        }
        // print node value
        System.out.println(node.getValue());
        //traverse to next node
        return traverseFromRight(node.getNext());
    }

    public void removeAllDuplicates() {

    }

    @Data
    private class Node {
        int value;
        Node next;
        Node previous;

        public Node(int value) {
            this.value = value;
        }
    }

}
