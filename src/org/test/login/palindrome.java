package org.test.login;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int a,i=0,j=0;
	a=n;
	while(a>10)
	{
	i=a%10;
	a=a/10;
	}
			System.out.println("the reverse is"+j);
	}
}