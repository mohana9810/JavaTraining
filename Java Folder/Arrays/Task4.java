import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        // 1.Initialize array
        int[] numbers = {1, 2, 3, 4, 5};

        // 2.Access third element
        System.out.println("Third element of the array: " + numbers[2]);

        // 3.Modify second element
        numbers[1] = 10;

        // 4.Array length
        System.out.println("Length of the array: " + numbers.length);

        // 5.Sum of elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        // 6.Average of elements
        double average = (double) sum / numbers.length;
        System.out.println("Average of elements: " + average);

        // 7.Find maximum
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element: " + max);

        // 8.Find minimum
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum element: " + min);

        // 9.Copy array
        int[] copyNumbers = new int[numbers.length];
        System.arraycopy(numbers, 0, copyNumbers, 0, numbers.length);

        // 10.Reverse array in-place
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // Print reversed array
        System.out.print("Reversed array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

      // 11.Check Existence
        boolean found = false;
        for (int num : numbers) {
            if (num == 6) {
                found = true;
                break;
            }
        }
        System.out.println("Value 6 exists in the array numbers: " + (found ? "Found" : "Not found"));

        // 12.Sort Array
        Arrays.sort(numbers);
        System.out.println("Sorted array numbers: " + Arrays.toString(numbers));

        // 13.Merge Arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));

        // 14.Count Occurrences
        int target = 3;
        int occurrences = 0;
        for (int num : numbers) {
            if (num == target) {
                occurrences++;
            }
        }
        System.out.println("Occurrences of " + target + " in the array numbers: " + occurrences);

        // 15.Remove Element at Index 2
        int indexToRemove = 2;
        if (indexToRemove >= 0 && indexToRemove < numbers.length) {
            int[] newArray = new int[numbers.length - 1];
            System.arraycopy(numbers, 0, newArray, 0, indexToRemove);
            System.arraycopy(numbers, indexToRemove + 1, newArray, indexToRemove, numbers.length - indexToRemove - 1);
            numbers = newArray;
        }
        System.out.println("Array numbers after removing element at index 2: " + Arrays.toString(numbers));
    
       }
       }