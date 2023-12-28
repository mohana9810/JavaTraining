public class Var
{
//Instance or Non-static variable
String studentName = "Siva";
//static variable
static String javaMentorName = "Mei";
//final variable - constant
final static String mentorName = "Mei";

public static void main (String[] args)
{
// Local variable
String welcomeMessage = "Welcome to Java Class";
System.out.println (welcomeMessage);
System.out.println (new Var ().studentName);

System.out.println (mentorName);
}
}
