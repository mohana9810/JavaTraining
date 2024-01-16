class MinMax
{
public static void main (String[] args)
{
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;
for (String arg:args)
{
int num = Integer.parseInt(arg);
min = Math.min(min, num);
max = Math.max(max, num);
}
System.out.println ("Minimum value:" + min);
System.out.println ("Maximum value:" +max);
}
}
