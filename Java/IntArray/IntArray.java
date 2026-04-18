import java.util.Arrays;
import java.util.Random;
public class IntArray{
    Random helpy = new Random();
    private int arraySize;
    private int[] array;
   
    public IntArray (int input){
        arraySize = input;
        array = new int[input];
    }

    public int size(){
        return arraySize;
    }
   
    public void fillRand(){
        for (int x = 0; x < array.length; x++){
         array[x] = helpy.nextInt(6 - 1 + 1) + 1;
        }
    }
   
    public void set(int index, int value){
        array[index] = value;
    }
   
    public int get(int index){
        return array[index];
    }

    public void clear(){
        array = null;
    }
    public boolean isEmpty(){
        if (array == null){
            return true;
        }
        else{
            return false;
        }
    }
   
    public void sort(){
        Arrays.sort(array);
    }
   
    public String toString(){
        String output = "";
        output += "The size of array is: ";
        output += arraySize;
        output += "\nThe values in the array are: [";
        for (int x = 0; x < array.length ; x++){
            output += array[x];
            if (x == array.length - 1){
                output += "]";
            }
            else{
                output += " ";
            }
        }
        return output;
    }
}
