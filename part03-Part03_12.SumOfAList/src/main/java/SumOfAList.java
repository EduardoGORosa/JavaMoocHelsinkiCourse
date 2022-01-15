
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        sum(list);
    }
    
    public static void sum(ArrayList<Integer> list){
        // toteuta listan lukujen summan laskeminen tänne
        int sum = 0;
        for(int i:list){
            sum = sum + i;
        }
        System.out.println("Sum:" + sum);
    }
}
