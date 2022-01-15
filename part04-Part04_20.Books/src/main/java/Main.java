import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while(true){
            System.out.println("Title:");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Pages:");
            int pag = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name,pag,year));
        }
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        if(input.equals("everything")){
            for(Book print : books){
                System.out.println(print);
            }
        }else if(input.equals("name")){
            for(Book printName : books){
                System.out.println(printName.getTitle());
            }    
        }
    }
}
