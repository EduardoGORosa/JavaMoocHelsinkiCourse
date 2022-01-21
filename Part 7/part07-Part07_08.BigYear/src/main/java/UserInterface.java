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
    private Scanner scan;
    private Database birdbase;
 
    public UserInterface(Scanner scan, Database base) {
        this.scan = scan;
        this.birdbase = base;
    }
 
    public void start() {
 
        OUTER:
        while (true) {
            String command = userInput();
            switch (command) {
                case "Quit":
                    break OUTER;
                case "Add":
                    add();
                    break;
                case "Observation":
                    observation();
                    break;
                case "One":
                    printOne();
                    break;
                case "All":
                    printAll();
                    break;
                default:
                    System.out.println("Unknown command!");
                    break;
            }
        }
    }
 
    public String userInput() {
        System.out.println("?");
        String command = scan.nextLine();
        return command;
    }
 
    public void add() {
        System.out.println("Name:");
        String name = userInput();
        System.out.println("Name in Latin:");
        String nameInLatin = userInput();
 
        birdbase.add(name, nameInLatin);
    }
 
    public void observation() {
        System.out.println("Name:");
        String name = userInput();
 
        boolean wasSuccessfull = birdbase.observation(name);
        if (!wasSuccessfull) {
            System.out.println(name + "is not a bird!");
        }
    }
 
    public void printOne() {
        System.out.println("Name:");
        String name = userInput();
        String birdToPrint = birdbase.oneBird(name);
        if (birdToPrint == null) {
            System.out.println(name + " is not a bird!");
        }else{
            System.out.println(birdToPrint);
        }
    }
 
    public void printAll() {
        System.out.print(birdbase.allBirds());
    }
}
