
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        for(int i=0; i<=list.size()-1;i++){
            if(i==list.size()-1){
                System.out.println(list.get(i));
            }else if(i==0){
                System.out.println(list.get(i));
            }
        }
    }
}
