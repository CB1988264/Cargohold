/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beck_
 */
import java.util.ArrayList;

public class Suitcase {
    
    //private int weight = 0;
    private int maxWeight = 0;
    private ArrayList<Item> items = new ArrayList<>();
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) <= maxWeight) {
            items.add(item);
        } else {
            return;
        }
    }
    
    public void printItems() {
        for (Item allItems : items) {
            System.out.println(allItems);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Item allItems : items) {
            weight += allItems.getWeight();
        }
        return weight;
    }
    
    public Item heaviestItem() {
        
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);
        
        for (Item newHeavy : items) {
            if(newHeavy.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = newHeavy;
            }
        }
        return heaviestItem;
    }
    
    public String toString() {
        
        int totalWeight = 0;
        
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        if (this.items.isEmpty()) {
            return "no items (" + totalWeight + " kg)";
        }
        if (this.items.size() == 1) {
            return "1 item (" + totalWeight + " kg)";
        }
        
        return this.items.size() + " items (" + totalWeight + " kg)";
    }
    
    
    
}
