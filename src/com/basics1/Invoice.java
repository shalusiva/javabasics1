package com.basics1;

public class Invoice {
String partNumber;
String partDescription;
int quantity;
double price;
public String getPartNumber() {
	return partNumber;
}
public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
}
public String getPartDescription() {
	return partDescription;
}
public void setPartDescription(String partDescription) {
	this.partDescription = partDescription;
}
public int getquantity() {
	return quantity;
}
public void setquantity(int quantity) {
	if(quantity<0) {
		this.quantity=0;
}else
{
	
	this.quantity=quantity;
}
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
}
