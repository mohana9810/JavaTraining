import java.util.*;
import java.io.*;
class fibo
{
public static void main (String[] args)
{
int n,f1,f2,f3,i;
Scanner s = new Scanner (System.in);
System.out.println ("Enter how many numbers n to display");
n=s.nextInt();
f1=0;
f2=1;
f3=f1+f2;
System.out.println(f1);
System.out.println(f2);
i=3;
do {
System.out.println (f3);
f1=f2;
f2=f3;
f3=f1+f2;
i=i+1;
}
while (i<=n);
}
}
