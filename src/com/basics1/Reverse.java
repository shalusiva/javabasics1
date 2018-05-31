package com.basics1;

public class Reverse {
	public static void main(String[] args)
	{ 
		Reverse r=new Reverse();
		r.reverse(5764);
	}
	
		public void  reverse(int n )
		{
			int reverse=0, rem; 
		
		  while(n!=0)    
		  {    
		     rem=n%10;    
		     reverse=reverse*10+rem;    
		     n/=10;    
		  }    
		  System.out.println("Reversed Number="+reverse);     
		}   
	}

