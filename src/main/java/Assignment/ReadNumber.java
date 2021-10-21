package Assignment;

import java.util.Scanner;

public class ReadNumber 
{
public static void main(String[] args) 
{
	int a = 0,b=10,sum;
	sum=a+b;
	System.out.println(";"+sum);
	
	//object of scanner class
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number:");
	//invoking nextint()method that reads an interger input by keyword
	//storing the input number in a var no.
	int num = sc.nextInt();
	//closing the scanner after use
	sc.close();
	
}
}