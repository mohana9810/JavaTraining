import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = scanner.nextLine();
scanner.close();

if(isPalindrome(input))
System.out.println(input + " is a palindrome.");
else
System.out.println(input + " is not a palindrome.");
}

public static boolean isPalindrome(String str) {
String reversed = "";
for (int i = str.length() - 1; i >= 0; i--) {
reversed += str.charAt(i);
}

if (str.equals(reversed))
return true;
else
return false;
}
}