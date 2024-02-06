import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        
        long fibN = fibonacci(n);
        System.out.println("The " + n + "th number in the Fibonacci series is: " + fibN);
    }
    
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        long fibPrev = 0;
        long fibCurr = 1;
        for (int i = 2; i <= n; i++) {
            long fibNext = fibPrev + fibCurr;
            fibPrev = fibCurr;
            fibCurr = fibNext;
        }
        return fibCurr;
    }
}