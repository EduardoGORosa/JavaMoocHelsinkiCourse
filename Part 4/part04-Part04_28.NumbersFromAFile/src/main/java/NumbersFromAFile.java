
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try(Scanner sFile = new Scanner(Paths.get(file))){
            while(sFile.hasNextLine()){
                list.add(sFile.nextLine());
            }
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        
        int c = 0;
        for(int i=0; i<list.size();i++){
            if(Integer.valueOf(list.get(i)) >= lowerBound && Integer.valueOf(list.get(i)) <= upperBound){
                c++;
            }
        }
        System.out.println("Numbers: " + c);
    }

}
