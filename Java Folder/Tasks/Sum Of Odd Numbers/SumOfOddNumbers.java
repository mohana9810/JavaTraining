class SumOfOddNumbers
{
public static void main (String[] args)
{
int sum = 0;
for (int i=0; i<=100; i++)
{
if (i%2!=0)
{
sum += i;
}
}
System.out.println ("Sum of odd numbers between 50 and 100:" + sum);
}
}