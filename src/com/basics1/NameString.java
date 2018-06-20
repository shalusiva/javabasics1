package com.basics1;
public class NameString {
	public String firstLetter;
	public String lastName;
	public String secondLetter;
	public String penultimateLetter;
	int a;
	public static void main(String[] args) {
      String s1="WORLD WIDE HELLOW";
      
      String[] words=s1.split("\\s");
      for(String w:words)
      {
      System.out.println(w);
      }
     // for(int i = 'A'; i <= 'Z'; i++) {
    	  //  System.out.println((char) i + " : " + (i - 'A' + 1));
    	    
    	    char[] a=s1.toCharArray();
    	    String a1="";
    	    String a2="";
    	    String a3="";
    	    for(char c:a){
    	    	System.out.println(c);
    	    }   
}
      
}                       
