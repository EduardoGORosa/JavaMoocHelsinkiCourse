
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            list.add(number);
        }
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = sum(list);
        average(sum, list);
    }
    
    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        for(int i:list){
            sum = sum + i;
        }
        return sum;
    }
    
    public static void average(int sum, ArrayList<Integer> list){
        double av = 1.0 * sum / list.size();
        System.out.println("Average: " + av);
    }
}
