package Caesarprogram;
//Name:              ABIODUN TAOFEEK TIAMIYU


//Student's Number:         21910091
//Course Code:                IT526
//Course Title:     Operating System And Network Security
/* Caesar Cipher is one of the simplest and most widely known encryption techniques. As we mention in class this method is a kind of substitution cipher in which each letter in the plain-text is replaced by a letter some fixed number of positions down the alphabet. Developed application should have following features;

1) Number of shift count(n) can be variable and application should take it as input. And according to this number new dictionary created.

2) Application should support encryption and decryption methods. In encryption the text which is given as plain-text form should be converted to cipher-text according to dictionary created in first step. And this cipher-text should printed to screen. In decryption, encrypted text should be taken by application. Then according to dictionary in reverse order it should be converted back to plain-text.

Developed application also has some constraints:

1) Application should use pre-defined 26 letter English alphabet. But this alphabet can be change in future use (ie. Turkish, German, Russian etc. ).
    SOLUTION PROGRAM:*/

	import java.util.*;
	public class Caesar_encryption{
		    public static void main(String args[]) {
	        Scanner Sc = new Scanner(System.in);
	        System.out.println("SOLUTION PROGRAM : ");
	        System.out.println("ABIODUN TAOFEEK TIAMIYU : ");
	        System.out.println("STUDENT NUMBER: 21910091 : ");
	        System.out.println("OPERATING SYSTEM AND NETWORK SECURITY : ");
	        System.out.println("ASSIGNMENT 2 : ");
	        System.out.println(" Input the plaintext message : ");
	        String plaintext = Sc.nextLine();
	        System.out.println(" Enter the value by which each character in the plaintext message gets shifted:");
	        int shift = Sc.nextInt();
	        String ciphertext = "";
	        char alphabet;
	        for(int i=0; i < plaintext.length();i++) 
	        {
	             // Shift one character at a time
	            alphabet = plaintext.charAt(i);
	            
	            // if alphabet lies between a and z 
	            if(alphabet >= 'a' && alphabet <= 'z') 
	            {
	             // shift alphabet
	             alphabet = (char) (alphabet + shift);
	             // if shift alphabet greater than 'z'
	             if(alphabet > 'z') {
	                // re-shift to starting position 
	                alphabet = (char) (alphabet+'a'-'z'-1);
	             }
	             ciphertext = ciphertext + alphabet;
	            }
	            
	            // if alphabet lies between 'A'and 'Z'
	            else if(alphabet >= 'A' && alphabet <= 'Z') {
	             // shift alphabet
	             alphabet = (char) (alphabet + shift);    
	                
	             // if shift alphabet greater than 'Z'
	             if(alphabet > 'Z') {
	                 //re-shift to starting position 
	                 alphabet = (char) (alphabet+'A'-'Z'-1);
	             }
	             ciphertext = ciphertext + alphabet;
	            }
	            else {
	             ciphertext = ciphertext + alphabet;   
	            }
	        
	    }
	    System.out.println(" ciphertext : " + ciphertext);
	  }
	}









