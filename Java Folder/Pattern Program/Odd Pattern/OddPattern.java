public class OddPattern {
    public static void main(String[] args) {
        int rows = 4; 
{
        int starCount = 1;
        for (int i = 1; i <= rows; i++) {
  
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= starCount; k++) {
                System.out.print("*");
            }
            System.out.println();
        
            starCount += 2;
        }
    }
}
}