package com.basics1;
import java .util.*;
public class CountWords {


	public static void main(String[] args)
    {
		int arr[]=new int[10];
		String s = "Bread butter bread butter bread butter bread";
        System.out.println("Enter the string");
 
        String[] words = s.trim().split(" ");
 
        System.out.println("Number of words in the string = "+words.length);
    }
}

