package javacodingtasks;

import java.util.Scanner;

public class stringsentencesameplace {

	public static void main(String[] args) {
		
		String s= "Iam a Indian";
		String words[] = s.split(" ");
		
		String reverseString="";
		
		for(String w:words) {
			String reverseWord="";
			
			for(int i= w.length()-1; i>=0; i--) {
				reverseWord += w.charAt(i);	
			}
			
			reverseString = reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
		
	
		/*  String sentence = "Profinch in Bangalore";
	        String reversedSentence = reverseWords(sentence);
	        System.out.println(reversedSentence);
	    }

	    public static String reverseWords(String sentence) {
	        String[] words = sentence.split(" "); // Split sentence into words
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            result.append(new StringBuilder(word).reverse().toString()); // Reverse each word using StringBuilder
	            result.append(" "); // Add space after each reversed word
	        }

	        return result.toString().trim();
	     */   
	
	}

}
