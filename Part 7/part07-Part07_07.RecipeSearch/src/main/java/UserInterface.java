import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dudug
 */
public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    private ArrayList<String> ingrs;
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
        this.ingrs = new ArrayList<>();
    }
    
    public void start(){
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        storingRecipes(file);
        while(true){
            String command = askForCommand();
            if(command.equals("stop")){
                break;
            }
            switch(command){
                case "list":
                    printList(recipes);
                    break;
                case "find name":
                    searchForName();
                    break;
                case "find cooking time":
                    searchForTime();
                    break;
                case "find ingredient":
                    searchForIngr();
                    break;
            }
        }
        
    }
    
    public void storingRecipes(String file){
        String name = "", time = "";
        int c = 0;
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                if(line.isEmpty()){
                    recipes.add(new Recipe(name,Integer.valueOf(time), ingrs));
                    c = 0;
                    name = "";
                    time = "";
                    ingrs = new ArrayList<>();
                    continue;
                }else if(c==0){
                    name = line;
                }else if(c==1){
                    time = line;
                }else{
                    ingrs.add(line);
                }
                c++;
            }
            recipes.add(new Recipe(name,Integer.valueOf(time), ingrs));
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void searchForName(){
        System.out.println("Searched word: ");
        String name = scanner.nextLine();
        ArrayList<Recipe> searched = new ArrayList<>();
        for(int i=0;i<recipes.size();i++){
            if(recipes.get(i).getName().contains(name)){
                searched.add(recipes.get(i));
            }
        }
        printList(searched);
    }
    
    public void searchForTime(){
        System.out.println("Max cooking time: ");
        int time = Integer.valueOf(scanner.nextLine());
        ArrayList<Recipe> searched = new ArrayList<>();
        for(int i=0;i<recipes.size();i++){
            if(recipes.get(i).getTime() <= time){
                searched.add(recipes.get(i));
            }
        }
        printList(searched);
    }
    
    public void searchForIngr(){
        System.out.println("Ingredient: ");
        String ingr = scanner.nextLine();
        ArrayList<Recipe> searched = new ArrayList<>();
        for(int i=0;i<recipes.size();i++){
            if(recipes.get(i).getIngr().contains(ingr)){
                searched.add(recipes.get(i));
            }
        }
        System.out.println("Recipes:\n");
        printList(searched);
    }
    
    public void printList(ArrayList<Recipe> print){
        for(int i=0;i<print.size();i++){
            System.out.println(print.get(i));
        }
    }
    
    public String askForCommand(){
        System.out.println("Commands:\nlist - lists the recipes\n" + 
                "stop - stops the program\n" + 
                "find name - searches recipes by name\n" + 
                "find cooking time - searches recipes by cooking time\n" + 
                "find ingredient - searches recipes by ingredient\n");
        System.out.println("Enter command:");
        String command = scanner.nextLine();
        return command;
    }
}
