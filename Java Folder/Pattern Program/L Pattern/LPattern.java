public class LPattern {
    public static void main(String[] args) {
        int size = 4;
        
       
        for (int i = 0; i < size; i++) {
       
            for (int j = 0; j < size; j++) {
            
                if (j == 0 || i == size - 1)
                    System.out.print("*");
         
                else
                    System.out.print(" ");
            }
    
            System.out.println();
        }
    }
}