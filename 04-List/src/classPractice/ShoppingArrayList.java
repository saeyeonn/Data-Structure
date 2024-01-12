package classPractice;

import java.util.LinkedList;
import java.util.List;

public class ShoppingArrayList {
    private static final List<String> shoppingArrayList = new LinkedList<>();

    private void checkShoppingList() {

        shoppingArrayList.add("cherry");
        System.out.println("Shopping List : " + shoppingArrayList.size() + " items -> " + shoppingArrayList);
        // cherry

        shoppingArrayList.add("yogurt");
        System.out.println("Shopping List : " + shoppingArrayList.size() + " items -> " + shoppingArrayList);
        // cherry, yogurt

        shoppingArrayList.add(1, "coffee");
        System.out.println("Shopping List : " + shoppingArrayList.size() + " items -> " + shoppingArrayList);
        // cherry, coffee, yogurt

        shoppingArrayList.add(1, "cake");
        System.out.println("Shopping List : " + shoppingArrayList.size() + " items -> " + shoppingArrayList);
        // cherry, cake, coffee, yogurt

        shoppingArrayList.add(1, "ramen");
        System.out.println("Shopping List : " + shoppingArrayList.size() + " items -> " + shoppingArrayList);
        // cherry, ramen, cake, coffee, yogurt

        System.out.println("The 0th item : " + shoppingArrayList.get(0));
        // 0th : cherry , change x

        System.out.println("coffee is located in " + shoppingArrayList.indexOf("coffee"));
        // coffee in 3 , change x

        System.out.println("I got " + shoppingArrayList.remove(1));
        // got ramen , [cherry, cake, coffee, yogurt]

        System.out.println("I should buy " + shoppingArrayList.size() + " items");
        // should buy 4 items

        shoppingArrayList.remove("cake");
        // return boolean (true)

        System.out.println("There are " + shoppingArrayList.size() + " items to buy.");
        // 3 items

        shoppingArrayList.clear();
        System.out.println("What I should buy are " + shoppingArrayList.size() + " items : " + shoppingArrayList.size());
        // 0 items
    }

    public static List<String> getShoppingArrayList() {
        System.out.println("// Array List Version // \n");
        return shoppingArrayList;
    }
}
