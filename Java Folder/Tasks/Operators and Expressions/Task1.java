class Task1 {
public static void main(String[] args) {
int a = 7;
int b = 3;
int dividend = 17;
int divisor = 4;
int num1 = 12;
int num2 = 8;
int year = 2024;
int length = 5;
int width = 7;

        // 1. Expression to add two integers a and b
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        // 2. Calculate the remainder when dividing an integer dividend by another integer divisor 
        int remainder = dividend % divisor;
        System.out.println("Remainder of " + dividend + " divided by " + divisor + " is: " + remainder);

        // 3. Evaluate the expression 5 * (10 + 3)
        int result1 = 5 * (10 + 3);
        System.out.println("Result of 5 * (10 + 3) is: " + result1);

        // 4. Find the result of the expression (8 - 3) * 2 / 5
        int result2 = (8 - 3) * 2 / 5;
        System.out.println("Result of (8 - 3) * 2 / 5 is: " + result2);

        // 5. Determine the value of the expression 10 % 3
        int modResult = 10 % 3;
        System.out.println("Result of 10 % 3 is: " + modResult);

        // 6. Calculate the average of two numbers num1 and num2
        double average = (num1 + num2) / 2.0;
        System.out.println("Average of " + num1 + " and " + num2 + " is: " + average);

        // 7. Determine whether an integer number is even or odd
        int number = 15;
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        // 8. Calculate the area of a rectangle with length length and width width
        int area = length * width;
        System.out.println("Area of rectangle with length " + length + " and width " + width + " is: " + area);

        // 9. Determine if an integer year is a leap year
        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        // 10. Calculate the hypotenuse of a right triangle given the lengths of its two legs a and b
        double hypotenuse = Math.sqrt(a * a + b * b);
        System.out.println("Hypotenuse of right triangle with legs " + a + " and " + b + " is: " + hypotenuse);
    }
}