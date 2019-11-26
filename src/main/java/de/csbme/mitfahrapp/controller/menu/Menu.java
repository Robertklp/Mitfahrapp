package de.csbme.mitfahrapp.controller.menu;

import java.util.List;

/**
 * @Author Felix Meyer
 * This class serves as the container holding all menu items and manges them
 */
public class Menu {

    private List<Item> items;

    public Menu(){
        this.items = List.of();
    }

    public Menu(Item... items){
        this.items = List.of(items);
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
}
