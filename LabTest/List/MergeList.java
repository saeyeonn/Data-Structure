package List;

import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MergeList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode main = new SinglyLinkedListNode(0);
        SinglyLinkedListNode mainPtr = main;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                mainPtr.next = head1;
                head1 = head1.next;
            } else {
                mainPtr.next = head2;
                head2 = head2.next;
            }
            mainPtr = mainPtr.next;
        }

        if (head1 != null) {
            mainPtr.next = head1;
        } else {
            mainPtr.next = head2;
        }

        return main.next;
    }
}
