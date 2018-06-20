package com.basics1;
import java.util.*;
public class TestCollection9 {
     public static void main(String args[]){  
      //Creating HashSet and adding elements  
      HashSet<String> set=new HashSet<String>();  
      set.add("Ravi");  
      set.add("Vijay");  
      set.add("pavi");  
      set.add("Ajay");  
      //Traversing elements  
      Iterator<String>itr=set.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      }  
     }  
    }  



