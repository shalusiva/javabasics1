package com.basics1;

public class switchcase1 {
	public static void main(String[] args) {
		int i = 1;
		double k;
		while ( i <= 10 )
		++i;
		


		for (k= 0.1; k<= 1.0; k+=0.1)
		{
		System.out.println("k="+k);
		}
		int n = 2;
		switch (n)
		{
		case 1:
		System.out.println( "The number is 1" );
		break;
		case 2:
		System.out.println( "The number is 2" );
		break;
		default:
		System.out.println( "The number is not 1 or 2" );
		break;
		}
		while (n< 10 )
		System.out.println( n++ );

		
	}

}
