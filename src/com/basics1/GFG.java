package com.basics1;

import java.util.Scanner;

//for count the repeated words in string
public class GFG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String word = sc.nextLine();
  		String s = word.toLowerCase();
		String s1[] = s.split(" ");
		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (s1[i].equals(s1[j])) {
					count++;
				}
				else
					break;

			}
		
		}
			
				System.out.println(count);
				//count=0;
		
	}
}
