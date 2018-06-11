package com.basics1;
import java.util.Scanner;

public class Frequency {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter an integer Number");
	long num=s.nextLong();
	long cnum=num,cnum2=0,d=0,d2=0,ctr=0,p=0;
	for(cnum=num;cnum>0;cnum=cnum2) {
		for(d=cnum%10,cnum=2,ctr=0,p=1;cnum>0;cnum/=10)
		{
			d2=cnum%10;
			if(d==d2)
			
				ctr++;
			else {
				cnum2+=d2*p;
				p*=10;
			}
		}
System.out.println("Frequency of "+d+"-->"+ctr);
}
}
}	

 