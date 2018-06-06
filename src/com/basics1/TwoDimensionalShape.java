package com.basics1;

public class TwoDimensionalShape extends Shape {
	float area;
	float breadth;
	public void square(int length)
	{
		area=length*length;
		System.out.println("square"+area);
	}
	
public void reactangle(int length,int breadth)
{
	area=length*breadth;
	System.out.println("reactangle"+area);
}
public static void main(String[] args)
{
	TwoDimensionalShape twoshape=new TwoDimensionalShape();
	twoshape.display();
	twoshape.square(8);
	twoshape.reactangle(10,8);
	
}
}