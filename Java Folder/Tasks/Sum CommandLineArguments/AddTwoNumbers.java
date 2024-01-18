public class AddTwoNumbers {

    public static void main(String[] args) {
       
        if (args.length != 2) {
            System.out.println("Usage: java AddTwoNumbers <num1> <num2>");
        } else {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            double sum = num1 + num2;

            System.out.println("Sum: " + sum);
        }
    }
}