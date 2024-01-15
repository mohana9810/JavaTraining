class Average
{
public static void main (String[] args)
{
int argsLength = args.length;
int total =0;
for (int i=0; i<args.length; i++)
{
total += Integer.parseInt(args[i]);
}
int average = total/argsLength;
System.out.println("Average:" + average);
}
}