package com.basics1;

public class WORLDWIDEWEB {

		public static int inputLength(char letter){
		return letter-64;
		}

		public static int inputLength(int a, int b){
		int length=a-b;
		if(length<0)
		    length=-length;
		return length;
		}

		public static void main(String[] args){
		String input1="WORLD WIDE WEB";
		char ch1,ch2;
		int counter;
		int center;
		int num1,num2;
		int sum;
		int output;
		String[] words=input1.toUpperCase().split("\\s");
		String totall="";

		for(String w:words){
			counter=0;
		    center=w.length()/2;
		    sum=0;
		    while(counter<center){
		        ch1=w.charAt(counter);
		        ch2=w.charAt(w.length()-counter-1);
		        counter++;
		        num1=inputLength(ch1);
		        num2=inputLength(ch2);
		        sum+=inputLength(num1,num2);
		    }
		    if(w.length()%2!=0)
		        sum+=inputLength(w.charAt(center));
		    totall+=sum;
		}
		output=Integer.valueOf(totall);


		System.out.println(output);    
		}

		}

