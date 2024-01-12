package Recursion;

import java.util.ArrayList;

public class Palindrome {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (head != null) {
            arrayList.add(head.val);
            head = head.next;
        }

        for (int i = 0; i <= arrayList.size() / 2 - 1; i++) {
            if (!arrayList.get(i)
                    .equals(arrayList.get(arrayList.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
