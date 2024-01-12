package classPractice;

import java.util.LinkedList;

public class ShoppingLinkedList {
    private static final LinkedList<String> shoppingLinkedList = new LinkedList<>();

    private ShoppingLinkedList() {

        shoppingLinkedList.add("cherry");
        System.out.println("Shopping List : " + shoppingLinkedList.size() + " items -> " + shoppingLinkedList);
        // cherry

        shoppingLinkedList.add("yogurt");
        System.out.println("Shopping List : " + shoppingLinkedList.size() + " items -> " + shoppingLinkedList);
        // cherry, yogurt

        shoppingLinkedList.add(1, "coffee");
        System.out.println("Shopping List : " + shoppingLinkedList.size() + " items -> " + shoppingLinkedList);
        // cherry, coffee, yogurt

        shoppingLinkedList.add(1, "cake");
        System.out.println("Shopping List : " + shoppingLinkedList.size() + " items -> " + shoppingLinkedList);
        // cherry, cake, coffee, yogurt

        shoppingLinkedList.add(1, "ramen");
        System.out.println("Shopping List : " + shoppingLinkedList.size() + " items -> " + shoppingLinkedList);
        // cherry, ramen, cake, coffee, yogurt

        System.out.println("The 0th item : " + shoppingLinkedList.get(0));
        // 0th : cherry , change x

        System.out.println("coffee is located in " + shoppingLinkedList.indexOf("coffee"));
        // coffee in 3 , change x

        System.out.println("I got " + shoppingLinkedList.remove(1));
        // got ramen , [cherry, cake, coffee, yogurt]

        System.out.println("I should buy " + shoppingLinkedList.size() + " items");
        // should buy 4 items

        shoppingLinkedList.remove("cake");
        // return boolean (true)

        System.out.println("There are " + shoppingLinkedList.size() + " items to buy.");
        // 3 items

        shoppingLinkedList.clear();
        System.out.println("What I should buy are " + shoppingLinkedList.size() + " items : " + shoppingLinkedList.size());
        // 0 items
    }

    public static LinkedList<String> getShoppingLinkedList() {
        System.out.println("// Linked List Version // \n");
        return shoppingLinkedList;
    }
}
