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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int sumWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.sumWeight = 0;
    }
    
    public void addItem(Item item){
        if(this.sumWeight + item.getWeight() <= this.maxWeight){
            this.sumWeight = this.sumWeight + item.getWeight();
            items.add(item);
        }
    }
    
    public String toString(){
        if(items.size() == 1){
            return items.size() + " item (" + this.sumWeight +  " kg)";
        }else if(items.isEmpty()){
            return "no items (0 kg)";
        }
        return items.size() + " items (" + this.sumWeight +  " kg)";
    }
    
    public void printItems(){
        for(Item pog: items){
            System.out.println(pog.getName() + "(" + pog.getWeight() +  " kg)");
        }
    }
    
    public String listItems(){
        String poggers = "";
        for(Item pog: items){
            poggers = poggers + pog.getName() + "(" + pog.getWeight() +  " kg)\n";
        }
        return poggers;
    }
    
    public int totalWeight(){
        return this.sumWeight;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heaviest = items.get(0);
        for(Item pog:items){
            if(pog.getWeight()>heaviest.getWeight()){
                heaviest = pog;
            }
        }
        return heaviest;
    }
}
