public class EligibilityChecker {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java EligibilityChecker <name> <age>");
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        if (age >= 18) {
            System.out.println(name + " is eligible to vote.");
        } else {
            System.out.println(name + " is not eligible to vote.");
        }
    }
}