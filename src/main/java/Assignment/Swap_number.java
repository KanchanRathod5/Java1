package Assignment;

import java.util.Scanner;

public class Swap_number 
{
public static void main(String[] args) {
	
     int x,y,z;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the value of x and y");
     System.out.println("before swapping number:");
	x = sc.nextInt();
	y = sc.nextInt();

	System.out.println("before swapping number:"+x+""+y);
	z=x;
	x=y;
	y=z;
	System.out.println("After swapping number:"+x+""+y);
	System.out.println();
}
}
