package com.basics1;
import java.util.*;
import java.util.List;

public class DemoHas {
	
public static void main(String[] args) {
	HashSet<String>name=new HashSet<String>();
	
	name.add("");
	name.add("");
	name.add("");
	name.add("");
	 List<String> nameList = new ArrayList<>(name);
     Collections.sort(nameList);
     
     System.out.println("HashSet elements after sorting: "+nameList);
 }

	

}
