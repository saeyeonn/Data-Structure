package Stack;

import List.InsertNode;
import jdk.dynalink.beans.StaticClass;

import java.util.Stack;

public class ReverseLinkedList {

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

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        Stack<Integer> stack = new Stack<>();
        SinglyLinkedListNode result = new SinglyLinkedListNode(0);
        SinglyLinkedListNode resultPtr = result;

        while (llist != null) {
            stack.push(llist.data);
            llist = llist.next;
        }

        while (!stack.empty()) {
            int popValue = stack.pop();
            resultPtr.next = new SinglyLinkedListNode(popValue);
            resultPtr = resultPtr.next;
        }
        return result.next;
    }

}
