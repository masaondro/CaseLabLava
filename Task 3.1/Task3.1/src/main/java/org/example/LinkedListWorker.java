package org.example;

public class LinkedListWorker {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextElement = current.getNext();
            current.setNext(previous);
            previous = current;
            current = nextElement;
        }
        return previous;
    }

    public ListNode reverseListRecursive(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.getNext() == null) {
            return head;
        }
        ListNode node = reverseListRecursive(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return node;
    }

    public ListNode createLinkedList() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        return head;
    }

    public void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
