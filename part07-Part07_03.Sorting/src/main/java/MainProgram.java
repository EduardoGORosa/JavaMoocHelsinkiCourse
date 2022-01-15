
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array){
    // write your code here
        int smallest = array[0];
        for(int i:array){
            if(i<smallest){
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        // write your code here
        int index = 0;
        int index_number = smallest(array);
        for(int i=0;i<array.length;i++){
            if(array[i] == index_number){
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int index = startIndex;
        int smallest = table[index];
        for(int i=startIndex;i<table.length;i++){
            if(table[i] < smallest){
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    public static void sort(int[] array) {
        int index = 0;
        while(index < array.length){
            swap(array,index,indexOfSmallestFrom(array,index));
             index++;       
        }   
    }
}
