public class Loops
 {
    public static void main(String[] args) {
        // 1.Print numbers from 1 to 10 using a for loop
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2.Print even numbers between 1 and 20 using a for loop
        System.out.println("\nEven numbers between 1 and 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3.Calculate the factorial of a given number n using a for loop
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("\nFactorial of " + n + ": " + factorial);

        // 4.Print Fibonacci series up to a given number limit using a for loop
        int limit = 20;
        int prev = 0, current = 1;
        System.out.println("\nFibonacci series up to " + limit + ":");
        System.out.print(prev + " " + current + " ");
        while (prev + current <= limit) {
            int next = prev + current;
            System.out.print(next + " ");
            prev = current;
            current = next;
        }
        System.out.println();

        // 5.Print multiplication table of a given number num using a for loop
        int num = 5;
        System.out.println("\nMultiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // 6.Find the sum of all numbers from 1 to 100 using a for loop
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("\nSum of all numbers from 1 to 100: " + sum);

        // 7.Check if a given number num is prime using a for loop
        int numToCheck = 17;
        boolean isPrime = true;
        for (int i = 2; i <= numToCheck / 2; i++) {
            if (numToCheck % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("\nIs " + numToCheck + " prime? " + isPrime);

        // 8.Find the greatest common divisor (GCD) of two numbers a and b using a for loop
        int a = 36, b = 48;
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("\nGCD of " + a + " and " + b + ": " + gcd);

        // 9.Reverse a given number num using a while loop
        int numToReverse = 12345;
        int reversedNumber = 0;
        while (numToReverse != 0) {
            int digit = numToReverse % 10;
            reversedNumber = reversedNumber * 10 + digit;
            numToReverse /= 10;
        }
        System.out.println("\nReversed number: " + reversedNumber);

        // 10.Print characters of a given string str in reverse order using a for loop
        String str = "Hello, World!";
        System.out.println("\nString in reverse order:");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}