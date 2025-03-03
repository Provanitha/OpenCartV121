package javacodingtasks;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		 int ar[] = {0, 1, 2, 4, 5, 9, 3,3,2};  // Example with duplicates

	        int len = ar.length;
	        System.out.println("The Array length is: " + len);
	        boolean duplicate= false;

	        // Outer loop to pick each element
	        for (int i = 0; i < len; i++) {
	            for (int j = i + 1; j < len; j++) {  // Inner loop starts after i
	                if (ar[i] == ar[j]) {
	                    System.out.println("Duplicate found: " + ar[i]);
	                    duplicate=true;
	                    break; // Stop checking once a duplicate is found for a number
	                }
	            }
	        }
	        if(!duplicate) {
	        	System.out.println("no duplicates");
	        }
	    }
	}