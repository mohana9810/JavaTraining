public class Task2 {

    public static void main(String[] args) {
        // 1.Check if a given number num is positive, negative, or zero
        int num = -5;
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is zero");
        }

        // 2.Determine whether a given year year is a leap year or not
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        // 3.Find the maximum of three numbers a, b, and c
        int a = 10, b = 20, c = 15;
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Maximum of " + a + ", " + b + ", and " + c + " is: " + max);

        // 4.Check if a given character ch is a vowel or a consonant
        char ch = 'e';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }

        // 5.Check if a given number num is even or odd
        int number = 7;
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        // 6.Determine the grade of a student based on their percentage percentage
        double percentage = 85.5;
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);

        // 7.Find the largest among three numbers num1, num2, and num3
        int num1 = 15, num2 = 25, num3 = 10;
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        System.out.println("Largest of " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);

        // 8.Determine if a given integer number is divisible by both 2 and 3
        int numberToCheck = 12;
        if (numberToCheck % 2 == 0 && numberToCheck % 3 == 0) {
            System.out.println(numberToCheck + " is divisible by both 2 and 3");
        } else {
            System.out.println(numberToCheck + " is not divisible by both 2 and 3");
        }

        // 9.Check if a given string str is palindrome or not
        String str = "radar";
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

        // 10.Determine the day of the week based on a given number dayNumber using switch statements
        int dayNumber = 3;
        String day;
        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid day number";
                break;
        }
        System.out.println("Day of the week for day number " + dayNumber + " is: " + day);
    }
}
