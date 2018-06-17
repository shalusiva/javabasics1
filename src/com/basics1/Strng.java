package com.basics1;
import java.util.Scanner;
public class Strng {
	public String firstTwo(String str) { 
		String a="";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");

		 if(str.length()<2){
		     return str;
		 }
		 else{
		     return str.substring(0,2);
		 }

		}
}
