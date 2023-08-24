package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedListWorker linkedListWorker = new LinkedListWorker();
        ListNode head = linkedListWorker.createLinkedList();
        System.out.println("Исходный связный список:");
        linkedListWorker.printLinkedList(head);

        ListNode reversedHead = linkedListWorker.reverseList(head);
        System.out.println("Инвертированный связный список (итерация):");
        linkedListWorker.printLinkedList(reversedHead);

        head = linkedListWorker.createLinkedList(); // Восстанавливаем исходный список
        reversedHead = linkedListWorker.reverseListRecursive(head);
        System.out.println("Инвертированный связный список (рекурсия):");
        linkedListWorker.printLinkedList(reversedHead);
    }
}