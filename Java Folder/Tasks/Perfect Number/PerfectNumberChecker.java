import java.util.Scanner;
public class PerfectNumberChecker {

public static boolean isPerfectNumber(int number) {
if (number <= 1) {
return false; 
}
int sum = 1; 
for (int i = 2; i <= Math.sqrt(number); i++) {
if (number % i == 0) {
sum += i; 
if (i != number / i) {
sum += number / i; 
}
} 
}
return sum == number;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int inputNumber = scanner.nextInt();
if (isPerfectNumber(inputNumber)) {
System.out.println(inputNumber + " is a perfect number.");
} else {
System.out.println(inputNumber + " is not a perfect number.");
}
scanner.close();
}
}