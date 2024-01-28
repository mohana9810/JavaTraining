import java.util.Scanner;
public class ArmstrongNumberChecker {
public static boolean isArmstrongNumber(int number) {
int originalNumber = number;
int numDigits = String.valueOf(number).length();
int sum = 0;
while (number > 0) {
int digit = number % 10;
sum += Math.pow(digit, numDigits);
number /= 10;
}
return sum == originalNumber;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int inputNumber = scanner.nextInt();
if (isArmstrongNumber(inputNumber)) {
System.out.println(inputNumber + " is an Armstrong number.");
} else {
System.out.println(inputNumber + " is not an Armstrong number.");
}
scanner.close();
}
}