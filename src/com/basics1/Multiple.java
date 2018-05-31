package com.basics1;

public class Multiple {
	public static void main(String[] args)
	{
		Multiple multiple=new Multiple();
		System.out.println("Is 6 a perfect number "+multiple.isPerfect(-7));
		System.out.println("Is 4 a multiple of two "+multiple.isMultiple(2, 6));
	}
public boolean isMultiple(int one,int two) {
	return two%one==0?true:false;
	
}
public boolean isEven(int one) {
	return one%2==0?true:false;
}
public double convertftoc(double fahrenheit) {
	
		return 5.0/9.0*(fahrenheit-32);
	

}
public double convertctof(double celsius)
{
	
	return 9.0 / 5.0 *( celsius + 32);
}

public boolean isPerfect(int number)
{
	int sum=0;
	for(int i=1;i<=number/2;i++)
	{
		if(number%i==0)
		{
			sum=sum+i;		
		}
	}

if(sum==number)
{
	return true;
}
	else
	{
		return false;
}
}
}