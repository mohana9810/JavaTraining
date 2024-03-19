public class TPattern {
    public static void main(String[] args) {
        int size = 5;
     
printTShapePattern(size);
    }

    public static void printTShapePattern(int size) {
        int mid = size / 2;

 
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();

        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}