package com.basics1;
import java.util.Scanner;
public class AnogramExample {
	
	 static void comPare(String s, String t) {
	char[] chrs = s.toLowerCase().toCharArray();
	char[] chrt = t.toLowerCase().toCharArray();
	int count=0;

	if(s.length()==t.length())
     {
	for(int i=0;i<s.length();i++)
	{
	for(int j=0;j<t.length();j++)
	{
	if(chrs[i]==chrt[j])
	{
	count++;
	}
	else
	continue;
	}
	}
	if(count==s.length() && count==t.length())
	{
	System.out.println("True");
	}
	else
	System.out.println("false");
	}
	else
	System.out.println("The words lengths do not match so they are not anagrams");

	}
public static void main(String[] args)
{
	AnogramExample w=new AnogramExample();
Scanner scan = new Scanner(System.in);
String s,t;
System.out.println("Enter the first string");
s = scan.nextLine();
System.out.println("Enter the second string");
t = scan.nextLine();
comPare(s,t);
}
}
