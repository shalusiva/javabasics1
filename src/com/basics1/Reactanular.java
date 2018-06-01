package com.basics1;

public class Reactanular {
	double length;
	double breadth;
	double side;
	public Reactanular(double length,double breadth) {
		if(length>0.0 && length<20.0 && breadth>0.0 && breadth<20.0) {
			this.length=length;
		this.breadth=breadth;
	}
	else
	{
		System.out.println("sorry length should between 0.0 and 20.0");
	
	}
	}
public double findAreaofReactanular() {
	return length*breadth;
}
public static void main(String[] args) {
	Reactanular shape=new Reactanular(2,6);
	System.out.println(shape.findAreaofReactanular());
}
}