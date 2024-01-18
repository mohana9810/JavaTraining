public class ConcatenateStrings {

    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Usage: java ConcatenateStrings <string1> <string2>");
        } else {
            
            String string1 = args[0];
            String string2 = args[1];

            
            String result = concatenateStrings(string1, string2);

            
            System.out.println("Concatenated string: " + result);
        }
    }

     public static String concatenateStrings(String str1, String str2) {
         return str1 + str2;
    }
}