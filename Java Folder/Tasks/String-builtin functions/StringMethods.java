class StringMethods
{
public static void main (String[] args)
{
String str1 ="Java";
String str2 = "  World";

//1.toUppercase
System.out.println (str1.toUpperCase());
System.out.println (str2.toUpperCase());

//2.toLowerCase
System.out.println (str1.toLowerCase());
System.out.println (str2.toLowerCase());

//3.Length
System.out.println (str1.length());
System.out.println (str2.length());

//4.trim
System.out.println (str2.trim());

//5.startsWith
System.out.println (str1.startsWith("J"));
System.out.println (str2.startsWith("W"));

//6.endsWith
System.out.println (str1.endsWith("a"));
System.out.println (str2.endsWith("D"));

//7.charAt
System.out.println (str1.charAt(3));
System.out.println (str2.charAt(3));

//8.concat
System.out.println (str2.concat(str1));

//9.replace
System.out.println (str1.replace("j","V"));

//10.equals
System.out.println (str1.equals(str2));

//11.compareTo
System.out.println (str1.compareTo(str2));

//12.indexOf
System.out.println (str1.indexOf("a"));
System.out.println(str2.indexOf("d"));

//13.lastIndexOf
System.out.println (str1.lastIndexOf("a"));

//14.format
System.out.println (str1.format("Hello, %s! Today is %dth %s.", "John", 4, "February"));

//15.join
String joinedString = String.join(str1.join(str2)); 
System.out.println (str1.join(str2));

}
}











