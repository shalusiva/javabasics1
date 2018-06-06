package com.basics1;

public class ThreeDimenstionalShape extends Shape {
float radius;
double area;
public void sphere(int radius)
{
	area=4*3.14*radius*radius;
	System.out.println("sphere"+area);
}

public void cube(int length)
{
area=6*length*length;
System.out.println("cube"+area);
}
public static void main(String[] args)
{
	ThreeDimenstionalShape threeshape=new ThreeDimenstionalShape();
	threeshape.display();
	threeshape.sphere(5);
	threeshape.cube(10);
	
}

}
