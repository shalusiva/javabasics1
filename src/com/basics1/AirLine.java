package com.basics1;
public class AirLine {
    int seat[]= {0,0,0,0,0,0,0,0,0,0};
    int firstclassseat= 0;
    int economyseatstart= 5;
    int lastseat=10;
public void display( ) {
        System.out.println("Please type 1 for First Class and Please type 2 for Economy");
}
public void type(int display) {
if(display==1)
{
    if(firstclassseat<5) {
        seat[firstclassseat]=1;
        System.out.println("Seat number :"+(firstclassseat+1));
        System.out.println("Class :The firstclass");
        firstclassseat++;
    }

    else
    {
        System.out.println("The seat is not available");
    }}
else   
{
    if(economyseatstart<10) {
        seat[economyseatstart]=1;
        System.out.println("Seat number :"+(economyseatstart+1 ));
        System.out.println("Class :The Economic section");
        economyseatstart++;
    }
    else
    {
        System.out.println("there is no seats available in economic section");
       
    }
}
}
public boolean check(int number)
{
    int i=number;
    if(seat[i-1]==1) {
        System.out.println("The seat "+i+"is no longer available");
        System.out.println();
        return true;
    }
    else {
        System.out.println("The seat"+i+"is Empty");
        System.out.println();
        return false;
       
       
    }
}
public void assign(int choice)
{
    if(choice==1)
    {
        System.out.println("Next flight leaves in 3hours");
    }
    else if(choice==2)
    {
        type(1);
    }}
    public static void main(String[] args)
    {
        AirLine reservation=new AirLine();
        System.out.println("Airline Reservation System");
        reservation.display();
        reservation.check(1);
        reservation.type(2);
       
       
    }}
