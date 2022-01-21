import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dudug
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> holds;
    private int sumWeight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.holds = new ArrayList<Suitcase>();
        this.sumWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.sumWeight + suitcase.totalWeight() <= this.maxWeight){
            this.sumWeight = this.sumWeight + suitcase.totalWeight();
            holds.add(suitcase);
        }
    }
    
    public String toString(){
        return holds.size() + " suitcases (" + this.sumWeight +  " kg)";
    }
    
    public void printItems(){
        for(Suitcase pog: holds){
            System.out.println(pog.listItems());
        }
    }
}
