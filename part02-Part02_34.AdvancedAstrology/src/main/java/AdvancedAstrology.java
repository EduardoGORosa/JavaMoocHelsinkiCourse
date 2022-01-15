
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while(i < number){
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while(i < number){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i = 0; i < size; i++) {
            //print [height] whitespace at the top, then one less space per line down to 1 at the bottom
            printSpaces(size-1-i);
            //print 1 star at the top, then 3, then 5...
            printStars(i*2 + 1);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        printTriangle(height);
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
