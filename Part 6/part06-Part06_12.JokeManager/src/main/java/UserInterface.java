/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author dudug
 */
public class UserInterface {
    private JokeManager jokemanager;
    private Scanner scanner;
    
    public UserInterface(JokeManager pog, Scanner pogger){
        this.jokemanager = pog;
        this.scanner = pogger;
    }
    
    public void start(){
        System.out.println("What a joke!");
        loop:
        while(true){
            printCommand();
            String command = scanner.nextLine();
            switch(command){
                case "1":
                    System.out.println("Write the joke to be added:");
                    jokemanager.addJoke(scanner.nextLine());
                    break;
                case "2":
                    System.out.println(jokemanager.drawJoke());;
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    jokemanager.printJokes();
                    break;
                case "X":
                    break loop;
            }
        }      
    }
    
    public void printCommand(){
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }
}
