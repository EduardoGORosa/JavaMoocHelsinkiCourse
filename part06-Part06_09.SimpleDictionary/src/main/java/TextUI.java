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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dic;
    
    public TextUI(Scanner scanner, SimpleDictionary dic){
        this.scanner = scanner;
        this.dic = dic;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(command.equals("add")){
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                dic.add(word, translation);
            }else if(command.equals("search")){
                System.out.println("To be translated: ");
                String word = scanner.nextLine();
                String returnTranslation = dic.translate(word);
                if (returnTranslation == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println(returnTranslation);
                }
            }
            System.out.println("Unknown command");
        }
    }
}
