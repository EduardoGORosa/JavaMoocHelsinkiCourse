
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Name:");
            String product = scanner.nextLine();
            if(product.isEmpty()){
                break;
            }
            items.add(new Item(product));
        }
        for(Item itens : items){
            System.out.println("Name: " + itens);
        }
    }
}
