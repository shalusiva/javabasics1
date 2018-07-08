package com.basics1;
	import java.util.*;

	public class UserIdGeneration{
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String First_Name = sc.next();
	        String Last_Name = sc.next();
	        int PIN = sc.nextInt();
	        int n = sc.nextInt();
	        char d=0,h=0,mm=0;
	        String name = "";
	        String m = "";
	        String fin = "";
	        
	        int a = First_Name.length();
	        int b = Last_Name.length();
	        if(a != b){
	            if(a>b){
	            char[] c = Last_Name.toCharArray();
	             d = c[b-1];
	            name = First_Name;
	            }else{
	            char[] c = First_Name.toCharArray();
	             d = c[a-1];
	             name = Last_Name;
	            }
	       } else{
	            char[] c = Last_Name.toCharArray();
	            char[] e = First_Name.toCharArray();
	            
	            int f = (int)c[0];
	            int g = (int)e[0];
	                for(int i=1;f==g;i++){
	                     f = (int)c[i];
	                     g = (int)e[i];
	                }
	           if(f>g){
	                 d = e[a-1];
	                name = Last_Name;
	            }else{
	                 d = c[b-1];
	                name = First_Name;
	            }
	        }
	        
	        String pin = PIN + "";
	        if(n <= pin.length()){
	            h= pin.charAt(n-1);
	        StringBuilder sb = new StringBuilder(pin);
	        sb.reverse();
	        m = sb+"";
	    mm=m.charAt(n-1);
	         
	        String word = d +""+ name; 
	        
	        for(int k=0;k<word.length();k++){
	            int ch=word.charAt(k);
	            if(ch>64 && ch<91){
	                ch=ch + 32;
	            }else if(ch>96 && ch<123){
	                ch=ch - 32;
	            }
	           fin = fin+ (char)ch +"";
	        }
	        System.out.println(fin+""+h+""+mm);
	    }else{
	        System.out.println("ERROR");
	    }
	 }
	}


