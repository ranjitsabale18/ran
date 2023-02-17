package Projectwings;

import java.util.Scanner;

public class evenNumber {

	public static boolean isEven(int n) {
		boolean res;
		res = n%2==0;
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your Input");
		int Input =sc.nextInt();
		boolean result= isEven(Input);
		System.out.println("is even number" + result);
	
}
}