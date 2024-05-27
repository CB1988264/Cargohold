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

public class Hold {
    
    private int maxWeight = 0;
    private ArrayList<Suitcase> suitcases;
    
    public Hold (int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int holdWeight =0;
        for (Suitcase addedCases : suitcases) {
            holdWeight += addedCases.totalWeight();
        }
        if ((this.maxWeight - holdWeight) >= suitcase.totalWeight()) {
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems () {
        for (Suitcase allCases : suitcases) {
            allCases.printItems();
        }
    }
    
    public String toString(){
       int holdWeight = 0;
       for (Suitcase addedCases : suitcases)  {
           holdWeight += addedCases.totalWeight();
       }
       return this.suitcases.size() + " suitcases (" + holdWeight + " kg)";
    }
    
}
