package com.basics1;
	import java.util.Scanner;
	public class WifiPin{
	public int unitValues;
	public int tensValue;
	public  int hundredValue;
	public int thousandsValue;
	public void unitValue(int num)
	{      
	unitValues=(num%100)/10;
	}
	public String tensValue(String name)
	{
	int n1=name.length();
	tensValue=name(n1%10);
	return name;
	}
	private int name(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void hundredValue(int num1)
	{
	int a=num1%10;
	switch(a) {
	case 1:
	hundredValue='!';
	break;
	case 2:
	hundredValue='@';
	break;
	case 3:
	hundredValue='#';
	break;
	case 4:
	hundredValue='$';
	break;
	case 5:
	hundredValue='%';
	break;
	case 6:
	hundredValue='^';
	break;
	case 7:
	hundredValue='&';
	break;
	case 8:
	hundredValue='*';
	break;
	case 9:
	hundredValue='(';
	break;
	case 0:
	hundredValue=')';
	break;
	}
	}
	public void thousandsValue(int num2)
	{
		int i,sum=0;
	 while(num2>0) {
	 i=num2%10;
	 sum+=i;
	num2=num2/10;
	 }
	 if(sum>=10) {
	  i=sum%10;
	thousandsValue+=i;
	sum=sum/10;
	}
	 else {
	 thousandsValue=sum;
	   }
		            
	 }
		            
	  public void concatenate() {
	Object wifiPin = thousandsValue+""+hundredValue+""+tensValue+""+unitValues;
		  System.out.println(wifiPin);
	   }
	public static void main(String[] args)
	{
	int roomNo;
	String name;
	WifiPin one=new WifiPin();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter The RoomNo:");
	roomNo =scan.nextInt();
	System.out.println("Enter your name");
	name=scan.next();
	one.unitValue(roomNo);
	one.tensValue(name);
	one.hundredValue(roomNo);
	one.thousandsValue(roomNo);
	one.concatenate();
		        }
	}


