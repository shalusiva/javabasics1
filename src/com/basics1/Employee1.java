package com.basics1;
import java.util.Scanner;
public class Employee1 
	{
	    private String firstName; 
	    private String lastName;
	    private int id; 
	     
	    public int nextUniqueId = 0;
	    public Scanner sc = new Scanner(System.in);
	     
	    public Employee1() 
	    {
	        firstName = " ";
	        lastName = " ";
	        nextUniqueId = 0;
	        id = nextUniqueId;
	    }
	 
	
	    public Employee1(String firstName, String lastName, int id) //constructor
	    {
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.id = id;
	    }  
	    public int getId() 
	    {
	 
	       return id;
	    }
	    public void setId( int id ) 
	    {
	      this.id = id;
	    }
	    public void setFirstName(String firstName)
	    {
	        this.firstName = firstName;
	    }        
	    public String getFirstName()
	    {
	        return firstName;
	    } 
	    public void setLastName (String lastName)
	    {
	        this.lastName = lastName;
	    }        
	    public String getLastName()
	    {
	        return lastName;
	    } 
	     
	   
	    @Override
	    public String toString()
	  {
	      return "First Name:           " + firstName + "\n" +
	             "Last Name:            " + lastName  + "\n" +
	             "Employee ID:          " + id        + "\n" ;
	  }

}
