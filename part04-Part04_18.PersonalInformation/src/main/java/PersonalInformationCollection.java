
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("First name:");
            String name1 = scanner.nextLine();
            if(name1.isEmpty()){
                break;
            }
            System.out.println("Last name:");
            String name2 = scanner.nextLine();
            System.out.println("Identification number: ");
            String id = scanner.nextLine();
            infoCollection.add(new PersonalInformation(name1,name2,id));
        }
        for (PersonalInformation personalInformation: infoCollection) {
            System.out.println(personalInformation.getFirstName() + ' ' + personalInformation.getLastName());
        }
    }
}
