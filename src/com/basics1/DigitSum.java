package com.basics1;

public class DigitSum {
	public static void main(String[] args) {
		DigitSum ds=new DigitSum();
		ds.sumOfDigits(6757);
		System.out.println(ds.sumOfDigits(6757));
	}
	
	public int sumOfDigits(int num) 
    {
        int sum = 0;

        while (num > 0)
        {
            sum = sum + num % 10;
            num = num / 10;
        }

        sum = (sum <10) ? sum : sumOfDigits(sum);

        return sum;
    }
}
