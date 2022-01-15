
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yesOrNo;
        while(true){
            System.out.println("Shall we carry on?");
            yesOrNo = scanner.nextLine();   
            if(yesOrNo.equals("no")){
                break;
            }
        }
    }
}
