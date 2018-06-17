package com.basics1;

public class Test {


		  public static void main(String[] args) {

		    String fullName = "John";
		    String[] tokens = fullName.split(" ");
		    String firstName = "";
		    String middleName = "";
		    String lastName = "";
		    if(tokens.length > 0) {
		        firstName = tokens[0];
		        middleName = tokens.length >2 ? getMiddleName(tokens) : "";
		        lastName = tokens[tokens.length -1];
		    }
		    System.out.println(firstName);
		    System.out.println(middleName);
		    System.out.println(lastName);
		  }

		  public static String getMiddleName(String[] middleName){
		      StringBuilder builder = new StringBuilder();
		      for (int i = 1; i < middleName.length-1; i++) {
		          builder.append(middleName[i] + " ");
		      }

		      return builder.toString();
		  }
		}

