package fibonacci;

import java.util.Scanner;

public class FibNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input in your number");
		int number = in.nextInt();
		int value = fibnumber(number);
		System.out.println(value);
		

	}
	
	public static int fibnumber(int n)
	{
		if(n < 2)
			return n;
		
		else
			return fibnumber(n-1) + fibnumber(n-2);
		
	}

}
