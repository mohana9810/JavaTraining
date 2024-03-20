import java.util.ArrayList;
import java.util.Collections;

public class MaxMinArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
     
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(8);
        arrayList.add(15);
        
       
        int max = Collections.max(arrayList);
        int min = Collections.min(arrayList);
        
      
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}