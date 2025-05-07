package 생활코딩;
import 생활코딩.lib.Item;

import java.util.ArrayList;


public class ClassPathDemo {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Long Sword", 10, 0, 2, 0));
        items.add(new Item("Ladder Armor", 2, 2, 20, 20));
        items.add(new Item("Round Shield", 2, 0, 10, 10));
        items.add(new Item("Ring", 0, 10, 0, 40));

        for (Item item : items) {
            item.showStatus();
            System.out.println("-----------");
        }

    }
}
