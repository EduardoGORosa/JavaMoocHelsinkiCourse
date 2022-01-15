

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int numberOfPrints){
        int i = 1;
        while(i<=numberOfPrints){
            System.out.println(i);
            i++;
        }
    }
}