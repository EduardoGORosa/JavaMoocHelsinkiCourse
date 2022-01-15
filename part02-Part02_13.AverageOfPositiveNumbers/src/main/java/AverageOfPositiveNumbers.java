
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }else if(number > 0){
                sum = sum + number;
                numbers = numbers + 1;
            }
        }
        double av = 1.0 * sum/numbers;
        if(av > 0){
            System.out.println("Average of the numbers: " + av);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
