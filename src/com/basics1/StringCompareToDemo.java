package com.basics1;   
public class StringCompareToDemo {
    /*
     * This java source code shows the use of compareTo() method of String class
     */

    public static void main(String[] args) {
        System.out.println("bc".compareTo("bac"));
        System.out.println("e".compareTo("test"));
        System.out.println("test".compareTo("tests"));
        String firstString = "Hello";
        String str = new String("qw");
        System.out.println(firstString.compareTo(str));

    }
}