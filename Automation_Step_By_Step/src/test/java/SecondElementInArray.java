import java.util.Scanner;

public class SecondElementInArray {

	public static void main(String[] args) {
		 int[] numbers = {10, 5, 20, 15, 8, 30,9,25};

	        // Initialize largest and second largest to minimum values
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        // Loop to find the largest number
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] < largest) {
	                secondLargest = largest; // Update second largest
	                largest = numbers[i]; // Update largest
	            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
	                secondLargest = numbers[i]; // Update second largest
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("There is no second largest element.");
	        } else {
	            System.out.println("The second largest number is: " + secondLargest);
	        }
	    }}