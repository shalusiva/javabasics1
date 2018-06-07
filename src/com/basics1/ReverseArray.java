package com.basics1;

public class ReverseArray {
	public static void main(String arg[])
	{
		int myarray[]= {9,19,29,38,44};
		for(int counter=myarray.length-1;counter>0;counter--) {
			System.out.println(myarray[counter]);
		}
	}
}
