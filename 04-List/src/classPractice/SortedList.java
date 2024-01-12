package classPractice;

import java.util.*;

// Analogy : Network of Emergency Contacts
public class SortedList<T> extends LinkedList<T> {
    CustomNode start;
    CustomNode last;

    private class CustomNode extends LinkedList<Integer> { // inner class Node
        private Integer data;
        private CustomNode next;
        private CustomNode(Integer dataPortion) {
            this(dataPortion, null);
        }
        private CustomNode(Integer dataPortion, CustomNode nextNode) {
            data = dataPortion;
            next = nextNode;
        } // constructor

        Integer getData() {
            return data;
        }
        CustomNode getNextNode() {
            return next;
        }
        void setData(Integer newData) {
            data = newData;
        }
        void setNextNode(CustomNode nextNode) {
            next = nextNode;
        }

        private int compareTo(Integer previousData) {
            return data - previousData;
        }
    }

    public void addNode(Integer x) {
        if (start == null || start.compareTo(x) > 0) {
            start = new CustomNode(x, start);
            return;
        }
        CustomNode customNode = start;

        while (customNode.next != null) {
            if (customNode.next.compareTo(x) > 0) {
                break;
            } customNode = customNode.next;
        }
    }
}
