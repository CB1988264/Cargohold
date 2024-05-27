/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beck_
 */
public class Item {
    
    private String name;
    private int weight = 0;
    
    public Item (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public String toString() {
        
        String name = this.name;
        int weight = this.weight;
        
        return name + "(" + weight + " kg)";
    }
}
