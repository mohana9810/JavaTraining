import java.util.ArrayList;

public class RemoveFifthElement {
    public static void main(String[] args) {
      
        ArrayList<String> arrayList = new ArrayList<>();

       
        arrayList.add("Apple");
        arrayList.add("Mango");
        arrayList.add("Orange");
        arrayList.add("Grape");
        arrayList.add("Banana"); 
        arrayList.add("Guava");
        
       
        System.out.println("ArrayList before removal:");
        System.out.println(arrayList);
        
      
        if (arrayList.size() >= 5) {
            arrayList.remove(4); 
            System.out.println("Fifth element removed successfully.");
        } else {
            System.out.println("ArrayList does not have a fifth element.");
        }
        
       
        System.out.println("ArrayList after removal:");
        System.out.println(arrayList);
    }
}