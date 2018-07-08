package com.basics1;
import java.util.Arrays;
public class FirstLastLetter {
	
	
	 
	static boolean allCharactersSame(String s)
	{
	    int n = s.length();
	    for (int i = 1; i < n; i++)
	        if (s.charAt(i) != s.charAt(0))
	            return false;
	         
	    return true;
	}
	 
	// Driver code
	    static public void main (String[] args){

	    	String[] result = "test".split("\\a");
	    	String first=result[0];
	    	String b=result[3];
	    	String asResult=Arrays.toString(result);
	    if (first==b) {
	        System.out.println(asResult.toUpperCase());
	    }
	    else
	        System.out.println("No");
	         
	    }
	}

