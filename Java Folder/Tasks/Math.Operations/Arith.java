import java.util.Scanner;
public class Arith
{
static int[] result = new int[4];
public static void add (int a, int b)
{
result[0]= a+b;
}
public static void sub (int a, int b)
{
result[1]=a-b;
}
public static void mul (int a, int b)
{
result[2] =a*b;
}
public static void div (int a, int b)
{
result[3] =a/b;
}
public static void main (String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first number:");
int num1 = scanner.nextInt();
System.out.print("Enter second number:");
int num2 = scanner.nextInt();
scanner.close();

add (num1, num2);
sub (num1, num2);
mul (num1, num2);
div (num1,num2);

for (int i=0; i<result.length; i++)
{
System.out.println(result[i]);
}
}
}


