import java.util.Scanner;
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
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todolist, Scanner scanner){
        this.todoList = todolist;
        this.scanner = scanner;
    }
    
    public void start(){
        loop:
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "stop":
                    break loop;
                case "add":
                    System.out.print("To add: ");
                    todoList.add(scanner.nextLine());
                    break;
                case "list":
                    todoList.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    todoList.remove(Integer.valueOf(scanner.nextLine()));
            }
        }
    }
}
