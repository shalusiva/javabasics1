package com.basics1;
import java.util.Scanner;
public class isPalindrom {
    private static Scanner s;
        public static void main(String [] args) {
            String n, a[];
            int i,j,l;
            System.out.println("Enter the string: ");
            s= new Scanner(System.in);
            n=s.nextLine();
            a=n.split("");
            l = a.length;
            for(i=0; i<l; i++){
                for(j=i+1; j<l; j++){
                    if(a[i].equalsIgnoreCase(a[j])) {
                        System.out.print(a[i]);
                    }
                        //System.out.print(a[j]);
                        if(a[i]!=a[j]){
                        	System.out.println(a[i]);
                        }
                    }
                }
            }
      
}