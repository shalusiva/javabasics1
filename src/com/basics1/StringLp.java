package com.basics1;

public class StringLp {
	
		 
	    public int stringLength,divide;

	    public String[] Substring(String input1) {


	    String firstName="";
	    String middleName="";
	    String lastName="";

	    stringLength=input1.length();

	        if(stringLength%3==0) {
	            divide=stringLength/3;
	        firstName=input1.substring(0,divide);
	        middleName=input1.substring(divide,(2*divide));
	        lastName=input1.substring((2*divide),(3*divide));

	    }
	       
	        if(stringLength%3==1) {
	            divide=stringLength/3;
	        firstName=input1.substring(0,divide);
	        middleName=input1.substring(divide,(2*divide)+1);
	        lastName=input1.substring((2*divide)+1,(2*divide)+2);

	    }
	        if(stringLength%3==2) {
	            divide=stringLength/3;
	        firstName=input1.substring(0,divide+1);
	        middleName=input1.substring(divide+1,(2*divide)+1);
	        lastName=input1.substring((2*divide),(3*divide)+2);

	    }
	        return  new String[]{firstName,middleName,lastName};
	    }
	    public static void main(String[] args) {
	        StringLp si=new StringLp();
	        String s1="john";
	        String s2="johny";
	        String s3="janardhan";
	        String a[]=si.Substring(s1);
	        String b[]=si.Substring(s2);
	        String c[]=si.Substring(s3);
	        System.out.println(a[0]+b[1]+c[2]);
	        System.out.println(a[1]+b[2]+c[0]);
	        System.out.println(a[2]+b[0]+c[1]);
	       
	    }
	    }



