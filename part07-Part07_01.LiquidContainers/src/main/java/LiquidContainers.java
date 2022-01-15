
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            switch(command){
                case "add":
                    if(amount >= 0)
                        if(first < 100){
                            first = first + amount;
                            }
                            if(first > 100){
                                first = 100;
                            }
                    break;
                case "remove":
                    if(amount >= 0) 
                        if(second - amount >= 0){
                            second = second - amount;
                        }else if(second - amount <= 0){
                            second = 0;
                        }
                    break;
                case "move":
                    if(amount >= 0)
                        if ((first - amount) >= 0) {
                    second += amount;
                    first -= amount;
                    if (second >= 100) {
                        second = 100;
                    }
                } else if ((first - amount) < 0) {
                    second += first;
                    first = 0;
                    if (second >= 100) {
                        second = 100;
                    }
                    break;
                }   
            }
        }
    }
}

