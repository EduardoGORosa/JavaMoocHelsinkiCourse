
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal){
        if(this.meals.contains(meal)){
            return;
        }else{
            meals.add(meal);
        }
    }
    
    public void printMeals(){
        for(String i: meals){
            System.out.println(i);
        }
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
}
