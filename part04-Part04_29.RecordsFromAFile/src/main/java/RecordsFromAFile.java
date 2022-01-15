
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try(Scanner sFile = new Scanner(Paths.get(file))){
            while(sFile.hasNextLine()){
                String line = sFile.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                String name = parts[0];
                
                 String ageString;
                
                int age = Integer.valueOf(parts[1]);
                if (age > 1 || age <= 0) {
                    ageString = " years";
                } else {
                    ageString = " year";
                }

                System.out.println(name + ", " + "age: " + age + ageString);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
