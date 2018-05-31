package com.basics1;

public class Invoices {
	public static void main(String[] args)
	{
		Invoice invoice1=new Invoice();
		 invoice1.setQuantity(5);
		 invoice1.setPrice(100);
		invoice1.setPartDescription("bolt");
		 System.out.println(invoice1.getQuantity());
		 double a= invoice1.getinvoiceAmount();
		 System.out.println(invoice1.getinvoiceAmount());
	}

}
