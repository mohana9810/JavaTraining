import java.util.ArrayList;
import java.util.Arrays;

public class SwapElements {
   
    public static void swapElementsArray(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    
    public static void swapElementsArrayList(ArrayList<Object> arrayList, int index1, int index2) {
        Object temp = arrayList.get(index1);
        arrayList.set(index1, arrayList.get(index2));
        arrayList.set(index2, temp);
    }

    public static void main(String[] args) {
        
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println("Array before swapping: " + Arrays.toString(array));
        swapElementsArray(array, 1, 3); 
        System.out.println("Array after swapping: " + Arrays.toString(array));

      
        ArrayList<Object> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("ArrayList before swapping: " + arrayList);
        swapElementsArrayList(arrayList, 1, 3); 
        System.out.println("ArrayList after swapping: " + arrayList);
    }
}