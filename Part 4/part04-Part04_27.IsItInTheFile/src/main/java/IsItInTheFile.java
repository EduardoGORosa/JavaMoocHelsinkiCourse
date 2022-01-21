
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try(Scanner line = new Scanner(Paths.get(file))){
            while(line.hasNextLine()){
                 list.add(line.nextLine());
            }
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        for(int i=0; i < list.size();i++){
            if(searchedFor.equals(list.get(i))){
                System.out.println("Found!");
                break;
            }else{
                if(i==list.size()-1){
                    System.out.println("Not found!");
                }
            }
        }
    }
}
